package com.jcr.monoservices.adapter.in.web;

import com.jcr.monoservices.application.port.in.ApplicationUseCase;
import com.jcr.monoservices.domain.model.dto.ApplicationDTO;
import com.jcr.monoservices.domain.model.dto.PaginationApplicationDTO;
import com.jcr.monoservices.domain.specification.ApplicationSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
    @Autowired
    private ApplicationUseCase applicationUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<ApplicationDTO> get(@PathVariable UUID id) {
        return ResponseEntity.ok(applicationUseCase.getById(id));
    }

    @GetMapping
    public ResponseEntity<PaginationApplicationDTO> pageable(
            ApplicationSpec spec,
            @RequestParam(value = "_limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "_offset", required = false, defaultValue = "0") int offset,
            @RequestParam(value = "_sor", required = false) List<String> sort
    ){
        return ResponseEntity.ok(applicationUseCase.pageable(spec, limit, offset, sort));
    }

}
