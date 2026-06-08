package com.jsegomez.companies.domain.dtos;

import java.time.LocalDate;

public record CompanyDto(
        String name,
        String founder,
        String logo,
        LocalDate foundationDate
) { }
