package com.jcr.monoservices.domain.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.web.PagedModel;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaginationApplicationDTO {
    @JsonProperty("pageable")
    PaginationDTO pageable;
    @JsonProperty("content")
    List<ApplicationDTO> content;
}
