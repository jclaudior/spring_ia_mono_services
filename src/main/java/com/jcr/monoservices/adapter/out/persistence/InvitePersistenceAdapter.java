package com.jcr.monoservices.adapter.out.persistence;

import com.jcr.monoservices.application.port.out.InviteRepositoryPort;
import com.jcr.monoservices.domain.model.Invite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class InvitePersistenceAdapter implements InviteRepositoryPort {
    @Autowired
    private InviteJpaRepository repository;

    @Override
    public Page<Invite> findAll(Specification<Invite> specification, Pageable pageable) {
        return repository.findAll(specification, pageable);
    }

    @Override
    public Invite save(Invite invite) {
        return repository.save(invite);
    }
}
