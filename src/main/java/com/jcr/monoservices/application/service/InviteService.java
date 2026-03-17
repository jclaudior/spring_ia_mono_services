package com.jcr.monoservices.application.service;

import com.jcr.monoservices.application.port.in.InviteUseCase;
import com.jcr.monoservices.application.port.out.InviteRepositoryPort;
import com.jcr.monoservices.domain.model.Company;
import com.jcr.monoservices.domain.model.Invite;
import com.jcr.monoservices.domain.model.dto.*;
import com.jcr.monoservices.domain.model.mapper.InviteMapper;
import com.jcr.monoservices.domain.specification.InviteSpec;
import com.jcr.monoservices.shared.util.SortUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InviteService implements InviteUseCase {
    @Autowired
    private InviteRepositoryPort repository;

    @Autowired
    private InviteMapper mapper;

    @Override
    public PaginationInviteDTO pageable(InviteSpec spec, int limit, int offset, List<String> sort) {
        Pageable pageable = PageRequest.of(offset, limit, SortUtils.createSort(sort));
        Page<Invite> pageInvites = repository.findAll(spec, pageable);
        List<InviteDTO> content = pageInvites.map(mapper::toDTO).toList();

        return PaginationInviteDTO.builder()
                .pageable(PaginationDTO.builder()
                        .offset(pageInvites.getNumber())
                        .limit(pageInvites.getSize())
                        .pageNumber(pageInvites.getNumber())
                        .pageElements(pageInvites.getNumberOfElements())
                        .totalElements(pageInvites.getTotalElements())
                        .totalPages(pageInvites.getTotalPages())
                        .build())
                .content(content)
                .build();
    }

    @Override
    public InviteDTO save(InviteRequestDTO inviteRequestDTO) {
        return mapper.toDTO(repository.save(mapper.toEntity(inviteRequestDTO)));
    }
}
