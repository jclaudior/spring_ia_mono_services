package com.jcr.monoservices.adapter.out.persistence;

import com.jcr.monoservices.application.port.out.CompanyRepositoryPort;
import com.jcr.monoservices.domain.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class CompanyPersistenceAdapter implements CompanyRepositoryPort {

    @Autowired
    private CompanyJpaRepository repository;

    @Override
    public Page<Company> findAll(Specification<Company> specification, Pageable pageable) {
        return repository.findAll(specification, pageable);
    }
}
