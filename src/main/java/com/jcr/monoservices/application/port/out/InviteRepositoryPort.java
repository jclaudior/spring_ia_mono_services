package com.jcr.monoservices.application.port.out;

import com.jcr.monoservices.domain.model.Invite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface InviteRepositoryPort {
    Page<Invite> findAll(Specification<Invite> specification, Pageable pageable);
    Invite save(Invite invite);
}
