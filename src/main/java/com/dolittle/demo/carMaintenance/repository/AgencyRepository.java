package com.dolittle.demo.carMaintenance.repository;

import com.dolittle.demo.carMaintenance.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepository extends JpaRepository<CarEntity, Long> {
}
