package com.jcr.monoservices.domain.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InviteRequestDTO {
    @JsonProperty("email")
    private String email;

    @JsonProperty("company")
    private CompanyDTO company;
}
