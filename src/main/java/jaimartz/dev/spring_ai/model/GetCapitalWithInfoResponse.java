package jaimartz.dev.spring_ai.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalWithInfoResponse(
        @JsonPropertyDescription("This is the capital's population") String population,
        @JsonPropertyDescription("This is the capital's region") String region,
        @JsonPropertyDescription("This is the capital's language") String language,
        @JsonPropertyDescription("This is the capital's currency") String currency) {
}
