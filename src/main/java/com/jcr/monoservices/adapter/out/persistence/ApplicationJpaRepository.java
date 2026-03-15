package com.jcr.monoservices.adapter.out.persistence;

import com.jcr.monoservices.domain.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApplicationJpaRepository extends JpaRepository<Application, UUID> {
}
