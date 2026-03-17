package com.jcr.monoservices.application.port.in;

import com.jcr.monoservices.domain.model.dto.InviteDTO;
import com.jcr.monoservices.domain.model.dto.InviteRequestDTO;
import com.jcr.monoservices.domain.model.dto.PaginationInviteDTO;
import com.jcr.monoservices.domain.specification.InviteSpec;

import java.util.List;

public interface InviteUseCase {
    PaginationInviteDTO pageable(InviteSpec spec, int limit, int offset, List<String> sort);
    InviteDTO save(InviteRequestDTO inviteRequestDTO);
}
