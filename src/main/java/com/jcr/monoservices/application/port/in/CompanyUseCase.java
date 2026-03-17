package com.jcr.monoservices.application.port.in;

import com.jcr.monoservices.domain.model.dto.PaginationCompanyDTO;
import com.jcr.monoservices.domain.specification.CompanySpec;

import java.util.List;

public interface CompanyUseCase {
    PaginationCompanyDTO pageable(CompanySpec spec, int limit, int offset, List<String> sort);
}
