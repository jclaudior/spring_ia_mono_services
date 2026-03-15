package com.jcr.monoservices.application.service;

import com.jcr.monoservices.application.port.in.ApplicationUseCase;
import com.jcr.monoservices.application.port.out.ApplicationRepositoryPort;
import com.jcr.monoservices.domain.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplicationService  implements ApplicationUseCase {
    @Autowired
    private ApplicationRepositoryPort repository;

    @Override
    public Application getById(UUID id) {
        return repository.findById(id).get();
    }

    @Override
    public Application create(Application application) {
        return repository.save(application);
    }
}
