package com.jcr.monoservices.application.port.out;

import com.jcr.monoservices.domain.model.Application;

import java.util.Optional;
import java.util.UUID;

public interface ApplicationRepositoryPort {
    Application save(Application application);

    Optional<Application> findById(UUID id);
}
