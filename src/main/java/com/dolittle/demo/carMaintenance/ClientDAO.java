package com.dolittle.demo.carMaintenance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<CarEntity, Long> {
}
