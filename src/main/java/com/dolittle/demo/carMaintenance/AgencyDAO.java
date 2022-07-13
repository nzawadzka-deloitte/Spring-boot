package com.dolittle.demo.carMaintenance;

import com.dolittle.demo.carMaintenance.AgencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyDAO extends JpaRepository<AgencyEntity, Long> {
}
