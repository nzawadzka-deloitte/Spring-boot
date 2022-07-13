package com.dolittle.demo.model;

import javax.persistence.*;

@Entity
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agency_id_generator")
    @SequenceGenerator(name = "agency_id_generator", sequenceName="agency_id_sqe", allocationSize = 1)
    private Long id;
    private String city;
    private String postcode;
    private String street;
    private int streetNumber;
    private int phoneNumber;
    private int numberOfWorkers;

    protected Agency(){

    }
    public Agency(Long id, String city, String postcode, String street, int streetNumber, int phoneNumber, int numberOfWorkers) {
        this.id = id;
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.phoneNumber = phoneNumber;
        this.numberOfWorkers = numberOfWorkers;
    }

}
