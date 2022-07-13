package com.dolittle.demo.carMaintenance.repository;

import com.dolittle.demo.carMaintenance.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
