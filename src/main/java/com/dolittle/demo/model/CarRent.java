package com.dolittle.demo.model;

import javax.persistence.*;

@Entity
public class CarRent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carRent_id_generator")
    @SequenceGenerator(name = "carRent_id_generator", sequenceName="carRent_id_sqe", allocationSize = 1)
    private Long id;
    private String accountNumber;
    private String date;
    private String agencyTaken;
    private String agencyReturn;
    private float price;

    protected CarRent(){}

    public CarRent(Long id, String accountNumber, String date, String agencyTaken, String agencyReturn, float price) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.date = date;
        this.agencyTaken = agencyTaken;
        this.agencyReturn = agencyReturn;
        this.price = price;
    }
}
