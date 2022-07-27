package com.dolittle.demo.carMaintenance.entity;

import javax.persistence.*;
import java.util.ArrayList;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity

public class CarEntity {
    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
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



    public CarEntity(Long id, String type, String name, int yearOfProduction, String color, float engineCapacity, float strenght, int vehicleMileage, ArrayList<String> worker){
        this.id = id;
        this.model =type;
        this.name=name;
        this.yearOfProduction = yearOfProduction;
        this.color=color;
        this.engineCapacity=engineCapacity;
        this.strenght=strenght;
        this.vehicleMileage=vehicleMileage;
        this.worker = worker;
    }
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setStrenght(float strenght) {
        this.strenght = strenght;
    }

    public void setVehicleMileage(int vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public void setWorker(ArrayList<String> worker) {
        this.worker = worker;
    }
}
