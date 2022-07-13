package com.dolittle.demo.carMaintenance.entity;

import javax.persistence.*;

@Entity
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "worker_id_generator")
    @SequenceGenerator(name = "worker_id_generator", sequenceName="worker_id_sqe", allocationSize = 1)
    private Long id;
    private String worker;
    private String position;

    protected WorkerEntity(){}
    public WorkerEntity(Long id, String worker, String position) {
        this.id = id;
        this.worker = worker;
        this.position = position;
    }
}
