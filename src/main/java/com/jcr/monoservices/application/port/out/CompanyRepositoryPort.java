package com.jcr.monoservices.application.port.out;

import com.jcr.monoservices.domain.model.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface CompanyRepositoryPort {
    Page<Company> findAll(Specification<Company> specification, Pageable pageable);
}
