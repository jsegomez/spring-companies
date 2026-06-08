package com.jsegomez.companies.persistence.entities;

import com.jsegomez.companies.domain.enums.Category;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "web_site")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WebSiteEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_company")
    private CompanyEntity company;

    public WebSiteEntity(String name, Category category, CompanyEntity company) {
        this.name = name;
        this.category = category;
        this.company = company;
    }
}
