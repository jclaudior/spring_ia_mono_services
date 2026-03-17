package com.jcr.monoservices.domain.model.mapper;

import com.jcr.monoservices.domain.model.Company;
import com.jcr.monoservices.domain.model.dto.CompanyDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyDTO toDTO(Company company);
}
