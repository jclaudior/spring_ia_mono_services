package com.jcr.monoservices.adapter.out.persistence;

import com.jcr.monoservices.domain.model.Invite;
import com.jcr.monoservices.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface InviteJpaRepository extends JpaRepository<Invite, UUID>, JpaSpecificationExecutor<Invite> {
}
