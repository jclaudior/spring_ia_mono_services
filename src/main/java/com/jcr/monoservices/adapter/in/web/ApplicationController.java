package com.jcr.monoservices.adapter.in.web;

import com.jcr.monoservices.application.port.in.ApplicationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
    @Autowired
    private ApplicationUseCase createUseCase;


}
