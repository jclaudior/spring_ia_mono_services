package com.jcr.monoservices.application.port.out;

import com.jcr.monoservices.domain.model.Application;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.Optional;
import java.util.UUID;

public interface ApplicationRepositoryPort {

    Optional<Application> findById(UUID id);

    Page<Application> findAll(Specification<Application> specification, Pageable pageable);
}
