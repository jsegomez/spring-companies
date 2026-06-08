package com.jsegomez.companies.persistence.crud;

import com.jsegomez.companies.persistence.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudCompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
