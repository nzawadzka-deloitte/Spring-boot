package com.dolittle.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import javax.persistence.*;

@Entity

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_id_generator")
    @SequenceGenerator(name = "car_id_generator", sequenceName="car_id_sqe", allocationSize = 1)
    private Long id;
    private String type;
    private String name;
    private int yearOfProduction;
    private String color;
    private float engineCapacity;
    private float strenght;
    private int vehicleMileage;

    protected Car(){}



    public Car(String type, String name, int yearOfProduction, String color, float engineCapacity, float strenght, int vehicleMileage){
        this.type=type;
        this.name=name;
        this.yearOfProduction = yearOfProduction;
        this.color=color;
        this.engineCapacity=engineCapacity;
        this.strenght=strenght;
        this.vehicleMileage=vehicleMileage;

    }



}
