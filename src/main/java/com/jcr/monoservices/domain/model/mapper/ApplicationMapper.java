package com.jcr.monoservices.domain.model.mapper;

import com.jcr.monoservices.domain.model.Application;
import com.jcr.monoservices.domain.model.dto.ApplicationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {
    ApplicationDTO toDTO(Application application);
}
