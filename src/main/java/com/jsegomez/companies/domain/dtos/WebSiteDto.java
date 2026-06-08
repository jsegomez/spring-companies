package com.jsegomez.companies.domain.dtos;

import com.jsegomez.companies.domain.enums.Category;

public record WebSiteDto(
        String name,
        Category category,
        CompanyDto company
) {
}
