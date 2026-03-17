package com.jcr.monoservices.adapter.in.web;

import com.jcr.monoservices.application.port.in.CompanyUseCase;
import com.jcr.monoservices.domain.model.dto.PaginationApplicationDTO;
import com.jcr.monoservices.domain.model.dto.PaginationCompanyDTO;
import com.jcr.monoservices.domain.specification.ApplicationSpec;
import com.jcr.monoservices.domain.specification.CompanySpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyUseCase companyUseCase;

    @GetMapping
    public ResponseEntity<PaginationCompanyDTO> pageable(
            CompanySpec spec,
            @RequestParam(value = "_limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "_offset", required = false, defaultValue = "0") int offset,
            @RequestParam(value = "_sor", required = false) List<String> sort
    ){
        return ResponseEntity.ok(companyUseCase.pageable(spec, limit, offset, sort));
    }
}
