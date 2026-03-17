package com.jcr.monoservices.domain.model.mapper;

import com.jcr.monoservices.domain.model.Invite;
import com.jcr.monoservices.domain.model.dto.InviteDTO;
import com.jcr.monoservices.domain.model.dto.InviteRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InviteMapper {
    InviteDTO toDTO(Invite invite);
    Invite toEntity(InviteRequestDTO inviteRequestDTO);
}
