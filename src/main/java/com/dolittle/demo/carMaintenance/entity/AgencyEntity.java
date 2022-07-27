package com.dolittle.demo.carMaintenance.entity;

import javax.persistence.*;

@Entity
public class AgencyEntity {
    @Id
    @SequenceGenerator(
            name = "agency_sequence",
            sequenceName = "agency_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String city;
    private String postcode;
    private String street;
    private int streetNumber;
    private int phoneNumber;
    private int numberOfWorkers;

    protected AgencyEntity(){

    }
    public AgencyEntity(Long id, String city, String postcode, String street, int streetNumber, int phoneNumber, int numberOfWorkers) {
        this.id = id;
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.phoneNumber = phoneNumber;
        this.numberOfWorkers = numberOfWorkers;
    }
    public AgencyEntity( String city, String postcode, String street, int streetNumber, int phoneNumber, int numberOfWorkers) {
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.phoneNumber = phoneNumber;
        this.numberOfWorkers = numberOfWorkers;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }
}
