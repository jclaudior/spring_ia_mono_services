package com.jcr.monoservices.adapter.out.persistence;

import com.jcr.monoservices.application.port.out.ApplicationRepositoryPort;
import com.jcr.monoservices.domain.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class ApplicationPersistenceAdapter implements ApplicationRepositoryPort {

    @Autowired
    private ApplicationJpaRepository repository;

    @Override
    public Application save(Application application) {
        return repository.save(application);
    }

    @Override
    public Optional<Application> findById(UUID id) {
        return repository.findById(id);
    }
}
