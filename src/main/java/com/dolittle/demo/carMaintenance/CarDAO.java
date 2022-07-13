package com.dolittle.demo.carMaintenance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<CarEntity, Long> {
}
