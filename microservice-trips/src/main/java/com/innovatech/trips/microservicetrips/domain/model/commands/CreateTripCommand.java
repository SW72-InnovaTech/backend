package com.innovatech.trips.microservicetrips.domain.model.commands;

import jakarta.validation.constraints.NotBlank;

public record CreateTripCommand(
        @NotBlank String origin,
        @NotBlank String destination,
        @NotBlank String time,
        @NotBlank String fare) {
}