package com.jsegomez.companies.persistence.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "company")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    private String name;
    private String founder;
    private String logo;

    @Column(name = "foundation_date")
    private LocalDate foundationDate;

    public Company(String name, String founder, String logo, LocalDate foundationDate) {
        this.name = name;
        this.founder = founder;
        this.logo = logo;
        this.foundationDate = foundationDate;
    }
}

