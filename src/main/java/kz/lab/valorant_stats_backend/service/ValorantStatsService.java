package kz.lab.valorant_stats_backend.service;

import kz.lab.valorant_stats_backend.api.dto.*;
import kz.lab.valorant_stats_backend.model.generated.EsportsSchedule;
import kz.lab.valorant_stats_backend.model.generated.MatchHistory;
import kz.lab.valorant_stats_backend.model.generated.PremierRoster;
import kz.lab.valorant_stats_backend.service.factory.ValorantApiStrategyFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Сервис для получения статистики игроков Valorant.
 */
@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ValorantStatsService {
    ValorantApiStrategyFactory strategyFactory;

    /**
     * Асинхронно получает историю матчей игрока.
     *
     * @param region  регион игрока (например, "eu")
     * @param puuid   уникальный идентификатор игрока
     * @param apiName имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с историей матчей
     */
    public Mono<MatchHistory> getMatchHistory(String region, String puuid, String apiName) {
        log.info("Requesting match history for region: {}, puuid: {}, api: {}", region, puuid, apiName);
        return strategyFactory.getStrategy(apiName)
                .fetchMatchHistory(region, puuid);
    }

    /**
     * Асинхронно получает историю матчей игрока по имени и тегу.
     *
     * @param region   регион игрока (например, "eu")
     * @param platform платформа игрока (например, "pc")
     * @param name     имя игрока
     * @param tag      тег игрока
     * @param apiName  имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с историей матчей
     */
    public Mono<MatchHistory> getMatchHistoryByNameTag(String region, String platform, String name, String tag, String apiName) {
        log.info("Requesting match history for region: {}, platform: {}, name: {}, tag: {}, api: {}",
                region, platform, name, tag, apiName);
        return strategyFactory.getStrategy(apiName)
                .fetchMatchHistoryByNameTag(region, platform, name, tag);
    }

    /**
     * Асинхронно получает подробную информацию о матче игрока по имени и тегу.
     * <p>
     * Преобразует историю матчей в структурированный DTO с информацией о турнире, командах, матче и результате.
     *
     * @param region   регион игрока (например, "eu")
     * @param platform платформа игрока (например, "pc")
     * @param name     имя игрока
     * @param tag      тег игрока
     * @param apiName  имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с подробностями матча
     */
    public Mono<MatchDetailsDto> getMatchDetails(String region, String platform, String name, String tag, String apiName) {
        log.info("Requesting match details for region: {}, platform: {}, name: {}, tag: {}, api: {}",
                region, platform, name, tag, apiName);
        return getMatchHistoryByNameTag(region, platform, name, tag, apiName)
                .map(this::convertToMatchDetailsDto)
                .defaultIfEmpty(MatchDetailsDto.builder().build());
    }

    // *** Добавлено: метод для получения расписания киберспортивных событий ***

    /**
     * Асинхронно получает расписание киберспортивных событий.
     * <p>
     * Преобразует данные в структурированный DTO.
     *
     * @param apiName имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с расписанием событий
     */
    public Mono<EsportsScheduleDto> getEsportsSchedule(String apiName) {
        log.info("Requesting esports schedule for api: {}", apiName);
        return strategyFactory.getStrategy(apiName)
                .fetchEsportsSchedule()
                .map(this::convertToEsportsScheduleDto)
                .defaultIfEmpty(EsportsScheduleDto.builder().build());
    }

    /**
     * Преобразует историю матчей в DTO с подробной информацией.
     *
     * @param history история матчей
     * @return {@link MatchDetailsDto} с информацией о турнире, командах, матче и результате
     */
    private MatchDetailsDto convertToMatchDetailsDto(MatchHistory history) {
        if (history == null || history.getData() == null || history.getData().isEmpty()) {
            return MatchDetailsDto.builder().build();
        }

        var match = history.getData().get(0);
        var metadata = match.getMetadata();

        TournamentInfoDto tournament = Optional.ofNullable(metadata.getPremier())
                .map(premier -> TournamentInfoDto.builder()
                        .tournamentId(premier.getTournamentId())
                        .name(premier.getName())
                        .seasonId(premier.getSeasonId())
                        .division(premier.getDivision())
                        .build())
                .orElse(null);

        List<TeamInfoDto> teams = Optional.ofNullable(match.getTeams())
                .orElse(Collections.emptyList())
                .stream()
                .map(team -> {
                    PremierRoster roster = team.getPremierRoster();
                    List<String> players = match.getPlayers().stream()
                            .filter(player -> player.getTeamId().equals(team.getTeamId()))
                            .map(player -> player.getName() + "#" + player.getTag())
                            .collect(Collectors.toList());
                    return TeamInfoDto.builder()
                            .teamId(team.getTeamId())
                            .rosterName(roster != null ? roster.getName() : null)
                            .rosterTag(roster != null ? roster.getTag() : null)
                            .players(players)
                            .roundsWon(team.getRounds().getWon())
                            .roundsLost(team.getRounds().getLost())
                            .won(team.getWon())
                            .build();
                })
                .collect(Collectors.toList());

        MatchInfoDto matchInfo = MatchInfoDto.builder()
                .matchId(metadata.getMatchId())
                .mapName(metadata.getMap().getName())
                .queueName(metadata.getQueue().getName())
                .gameLengthInMs(metadata.getGameLengthInMs())
                .startedAt(metadata.getStartedAt())
                .build();

        String result = teams.stream()
                .filter(TeamInfoDto::getWon)
                .findFirst()
                .map(team -> team.getRosterName() != null ? team.getRosterName() + " won" : team.getTeamId() + " won")
                .orElse("Draw");

        return MatchDetailsDto.builder()
                .tournament(tournament)
                .teams(teams)
                .match(matchInfo)
                .result(result)
                .build();
    }

    // *** Добавлено: метод для преобразования расписания в DTO ***

    /**
     * Преобразует расписание киберспортивных событий в DTO.
     *
     * @param schedule расписание событий
     * @return {@link EsportsScheduleDto} с информацией о расписании
     */
    private EsportsScheduleDto convertToEsportsScheduleDto(EsportsSchedule schedule) {
        if (schedule == null || schedule.getData() == null) {
            return EsportsScheduleDto.builder().build();
        }

        List<ScheduleItemDto> items = schedule.getData().stream()
                .map(item -> {
                    LeagueDto league = Optional.ofNullable(item.getLeague())
                            .map(l -> LeagueDto.builder()
                                    .name(l.getName())
                                    .identifier(l.getIdentifier())
                                    .icon(l.getIcon())
                                    .region(l.getRegion())
                                    .build())
                            .orElse(null);

                    TournamentDto tournament = Optional.ofNullable(item.getTournament())
                            .map(t -> TournamentDto.builder()
                                    .name(t.getName())
                                    .season(t.getSeason())
                                    .build())
                            .orElse(null);

                    EsportsMatchDto match = Optional.ofNullable(item.getMatch())
                            .map(m -> {
                                GameTypeDto gameType = Optional.ofNullable(m.getGameType())
                                        .map(gt -> GameTypeDto.builder()
                                                .type(gt.getType())
                                                .count(gt.getCount())
                                                .build())
                                        .orElse(null);

                                List<TeamDto> teams = Optional.ofNullable(m.getTeams())
                                        .orElse(Collections.emptyList())
                                        .stream()
                                        .map(team -> {
                                            RecordDto record = Optional.ofNullable(team.getRecord())
                                                    .map(r -> RecordDto.builder()
                                                            .wins(r.getWins())
                                                            .losses(r.getLosses())
                                                            .build())
                                                    .orElse(null);

                                            return TeamDto.builder()
                                                    .name(team.getName())
                                                    .code(team.getCode())
                                                    .icon(team.getIcon())
                                                    .hasWon(team.getHasWon())
                                                    .gameWins(team.getGameWins())
                                                    .record(record)
                                                    .build();
                                        })
                                        .collect(Collectors.toList());

                                return EsportsMatchDto.builder()
                                        .id(m.getId())
                                        .gameType(gameType)
                                        .teams(teams)
                                        .build();
                            })
                            .orElse(null);

                    return ScheduleItemDto.builder()
                            .date(item.getDate())
                            .state(item.getState())
                            .type(item.getType())
                            .vod(item.getVod())
                            .league(league)
                            .tournament(tournament)
                            .match(match)
                            .build();
                })
                .collect(Collectors.toList());

        return EsportsScheduleDto.builder()
                .status(schedule.getStatus())
                .scheduleItems(items)
                .build();
    }
}