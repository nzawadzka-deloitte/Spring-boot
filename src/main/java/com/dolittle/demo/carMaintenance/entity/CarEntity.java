package com.dolittle.demo.carMaintenance.entity;

import javax.persistence.*;
import java.util.ArrayList;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity

public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_id_generator")
    @SequenceGenerator(name = "car_id_generator", sequenceName="car_id_sqe", allocationSize = 1)
    private Long id;
    private String model;
    private String name;
    private int yearOfProduction;
    private String color;
    private float engineCapacity;
    private float strenght;
    private int vehicleMileage;

    private ArrayList<String> worker;


    protected CarEntity(){}



    public CarEntity(String type, String name, int yearOfProduction, String color, float engineCapacity, float strenght, int vehicleMileage, ArrayList<String> worker){
        this.model =type;
        this.name=name;
        this.yearOfProduction = yearOfProduction;
        this.color=color;
        this.engineCapacity=engineCapacity;
        this.strenght=strenght;
        this.vehicleMileage=vehicleMileage;
        this.worker = worker;

    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public float getStrenght() {
        return strenght;
    }

    public int getVehicleMileage() {
        return vehicleMileage;
    }

    public ArrayList<String> getWorker() {
        return worker;
    }
}
