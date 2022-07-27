package com.dolittle.demo.carMaintenance.repository;

import com.dolittle.demo.carMaintenance.entity.CarRentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRentRepository extends JpaRepository<CarRentEntity, Long> {
}
