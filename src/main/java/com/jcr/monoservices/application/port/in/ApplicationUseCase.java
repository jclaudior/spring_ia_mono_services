package com.jcr.monoservices.application.port.in;

import com.jcr.monoservices.domain.model.dto.ApplicationDTO;
import com.jcr.monoservices.domain.model.dto.PaginationApplicationDTO;
import com.jcr.monoservices.domain.specification.ApplicationSpec;

import java.util.List;
import java.util.UUID;

public interface ApplicationUseCase {
    ApplicationDTO getById(UUID id);

    PaginationApplicationDTO pageable(ApplicationSpec spec, int limit, int offset, List<String> sort);
}
