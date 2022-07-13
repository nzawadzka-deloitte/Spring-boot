package com.dolittle.demo.carMaintenance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerDAO extends JpaRepository<CarEntity, Long> {
}
