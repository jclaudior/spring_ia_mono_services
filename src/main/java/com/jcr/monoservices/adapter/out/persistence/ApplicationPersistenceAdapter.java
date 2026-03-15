package com.jcr.monoservices.adapter.out.persistence;

import com.jcr.monoservices.application.port.out.ApplicationRepositoryPort;
import com.jcr.monoservices.domain.model.Application;

import java.util.Optional;
import java.util.UUID;

public class ApplicationPersistenceAdapter implements ApplicationRepositoryPort {

    private final ApplicationJpaRepository repository;

    public ApplicationPersistenceAdapter(ApplicationJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Application save(Application application) {
        return null;
    }

    @Override
    public Optional<Application> findById(UUID id) {
        return Optional.empty();
    }
}
