package com.dolittle.demo.carMaintenance.DAO;

import com.dolittle.demo.carMaintenance.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<CarEntity, Long> {
}
