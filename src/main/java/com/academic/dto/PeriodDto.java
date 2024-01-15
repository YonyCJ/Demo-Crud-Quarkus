package com.academic.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class PeriodDto {

    @Getter
    @Setter
    public static class Response {
        private UUID idPeriod;
        private String name;
        private String description;
        private LocalDate startDate;
        private LocalDate endDate;
        private Integer state;
        private Boolean isActive;
    }
    @Getter
    @Setter
    public static class Request {
        private UUID idPeriod;
        private String name;
        private String description;
        private LocalDate startDate;
        private LocalDate endDate;
        private Integer state;
    }

}

