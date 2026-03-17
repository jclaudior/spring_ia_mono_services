package com.jcr.monoservices.application.service;

import com.jcr.monoservices.application.port.in.CompanyUseCase;
import com.jcr.monoservices.application.port.out.CompanyRepositoryPort;
import com.jcr.monoservices.domain.model.Company;
import com.jcr.monoservices.domain.model.dto.CompanyDTO;
import com.jcr.monoservices.domain.model.dto.PaginationCompanyDTO;
import com.jcr.monoservices.domain.model.dto.PaginationDTO;
import com.jcr.monoservices.domain.model.mapper.CompanyMapper;
import com.jcr.monoservices.domain.specification.CompanySpec;
import com.jcr.monoservices.shared.util.SortUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements CompanyUseCase {

    @Autowired
    private CompanyRepositoryPort repository;

    @Autowired
    private CompanyMapper mapper;

    @Override
    public PaginationCompanyDTO pageable(CompanySpec spec, int limit, int offset, List<String> sort) {
        Pageable pageable = PageRequest.of(offset, limit, SortUtils.createSort(sort));
        Page<Company> pageCompanies = repository.findAll(spec, pageable);
        List<CompanyDTO> content = pageCompanies.map(mapper::toDTO).toList();

        return PaginationCompanyDTO.builder()
                .pageable(PaginationDTO.builder()
                        .offset(pageCompanies.getNumber())
                        .limit(pageCompanies.getSize())
                        .pageNumber(pageCompanies.getNumber())
                        .pageElements(pageCompanies.getNumberOfElements())
                        .totalElements(pageCompanies.getTotalElements())
                        .totalPages(pageCompanies.getTotalPages())
                        .build())
                .content(content)
                .build();
    }
}
