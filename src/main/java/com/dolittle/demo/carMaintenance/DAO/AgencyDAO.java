package com.dolittle.demo.carMaintenance.DAO;

import com.dolittle.demo.carMaintenance.entity.AgencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyDAO extends JpaRepository<AgencyEntity, Long> {
}
