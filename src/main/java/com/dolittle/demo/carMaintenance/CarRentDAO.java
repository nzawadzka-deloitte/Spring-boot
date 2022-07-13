package com.dolittle.demo.carMaintenance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentDAO extends JpaRepository<CarEntity, Long> {
}
