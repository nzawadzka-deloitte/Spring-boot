package com.dolittle.demo.carMaintenance.DAO;

import com.dolittle.demo.carMaintenance.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentDAO extends JpaRepository<CarEntity, Long> {
}
