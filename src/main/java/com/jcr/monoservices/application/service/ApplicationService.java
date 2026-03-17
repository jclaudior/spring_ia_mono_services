package com.jcr.monoservices.application.service;

import com.jcr.monoservices.application.port.in.ApplicationUseCase;
import com.jcr.monoservices.application.port.out.ApplicationRepositoryPort;
import com.jcr.monoservices.domain.model.Application;
import com.jcr.monoservices.domain.model.dto.ApplicationDTO;
import com.jcr.monoservices.domain.model.dto.PaginationApplicationDTO;
import com.jcr.monoservices.domain.model.dto.PaginationDTO;
import com.jcr.monoservices.domain.model.mapper.ApplicationMapper;
import com.jcr.monoservices.domain.specification.ApplicationSpec;
import com.jcr.monoservices.shared.util.SortUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ApplicationService  implements ApplicationUseCase {
    @Autowired
    private ApplicationRepositoryPort repository;

    @Autowired
    private ApplicationMapper mapper;

    public ApplicationDTO getById(UUID id) {
        Application application = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Application not found with id: " + id
                ));

        return mapper.toDTO(application);
    }

    @Override
    public PaginationApplicationDTO pageable(ApplicationSpec spec, int limit, int offset, List<String> sort) {
        Pageable pageable = PageRequest.of(offset, limit, SortUtils.createSort(sort));
        Page<Application> pageApplications = repository.findAll(spec, pageable);
        List<ApplicationDTO> content = pageApplications.map(mapper::toDTO).toList();

        return PaginationApplicationDTO.builder()
                .pageable(PaginationDTO.builder()
                        .offset(pageApplications.getNumber())
                        .limit(pageApplications.getSize())
                        .pageNumber(pageApplications.getNumber())
                        .pageElements(pageApplications.getNumberOfElements())
                        .totalElements(pageApplications.getTotalElements())
                        .totalPages(pageApplications.getTotalPages())
                        .build())
                .content(content)
                .build();

    }
}
