package com.jcr.monoservices.application.service;

import com.jcr.monoservices.application.port.in.ApplicationUseCase;
import com.jcr.monoservices.application.port.out.ApplicationRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService  implements ApplicationUseCase {
    @Autowired
    private ApplicationRepositoryPort repository;
}
