package com.dolittle.demo.carMaintenance.repository;

import com.dolittle.demo.carMaintenance.entity.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {
}
