package com.jcr.monoservices.adapter.in.web;

import com.jcr.monoservices.application.port.in.ApplicationUseCase;
import com.jcr.monoservices.domain.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
    @Autowired
    private ApplicationUseCase applicationUseCase;

    @PostMapping
    public Application create(@RequestBody Application application) {
        return applicationUseCase.create(application);
    }

    @GetMapping("/{id}")
    public Application get(@PathVariable UUID id) {
        return applicationUseCase.getById(id);
    }


}
