package com.dolittle.demo.carMaintenance.repository;

import com.dolittle.demo.carMaintenance.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
