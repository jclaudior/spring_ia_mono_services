package com.jcr.monoservices.application.port.in;

import com.jcr.monoservices.domain.model.Application;

import java.util.UUID;

public interface ApplicationUseCase {
    Application getById(UUID id);

    Application create(Application application);
}
