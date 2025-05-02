package kz.lab.valorant_stats_backend.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import kz.lab.valorant_stats_backend.model.Status;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * Десериализатор для поля `status`, которое может быть числом или объектом.
 * <p>
 * Поддерживает следующие форматы:
 * - Число (например, `200` для успеха).
 * - Объект `{ "code": 1, "message": "success" }`.
 */
@Slf4j
public class StatusDeserializer extends JsonDeserializer<Status> {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public Status deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonNode node = p.readValueAsTree();
        log.debug("Deserializing status: {}", node.toString());
        try {
            if (node.isInt()) {
                return new Status(node.intValue(), "Success");
            } else if (node.isObject()) {
                return mapper.treeToValue(node, Status.class);
            } else {
                log.warn("Unexpected status format: {}", node.toString());
                return new Status(0, "Unknown status format");
            }
        } catch (JsonProcessingException e) {
            log.error("Failed to deserialize status: {}", node.toString(), e);
            throw new IOException("Invalid status format", e);
        }
    }
}
