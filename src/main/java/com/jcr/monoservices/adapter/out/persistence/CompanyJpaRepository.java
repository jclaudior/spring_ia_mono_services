package com.jcr.monoservices.adapter.out.persistence;

import com.jcr.monoservices.domain.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface CompanyJpaRepository extends JpaRepository<Company, UUID>, JpaSpecificationExecutor<Company> {
}
