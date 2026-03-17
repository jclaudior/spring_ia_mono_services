package com.jcr.monoservices.adapter.in.web;

import com.jcr.monoservices.application.port.in.InviteUseCase;
import com.jcr.monoservices.domain.model.dto.InviteDTO;
import com.jcr.monoservices.domain.model.dto.InviteRequestDTO;
import com.jcr.monoservices.domain.model.dto.PaginationCompanyDTO;
import com.jcr.monoservices.domain.model.dto.PaginationInviteDTO;
import com.jcr.monoservices.domain.specification.CompanySpec;
import com.jcr.monoservices.domain.specification.InviteSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/invites")
public class InviteController {

    @Autowired
    private InviteUseCase inviteUseCase;

    @GetMapping
    public ResponseEntity<PaginationInviteDTO> pageable(
            InviteSpec spec,
            @RequestParam(value = "_limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "_offset", required = false, defaultValue = "0") int offset,
            @RequestParam(value = "_sor", required = false) List<String> sort
    ){
        return ResponseEntity.ok(inviteUseCase.pageable(spec, limit, offset, sort));
    }

    @PostMapping
    public ResponseEntity<InviteDTO> save(@RequestBody InviteRequestDTO inviteRequestDTO) {

        InviteDTO inviteDTO = inviteUseCase.save(inviteRequestDTO);

        URI location = URI.create("/invites/" + inviteDTO.getId());

        return ResponseEntity
                .created(location)
                .body(inviteDTO);
    }
}
