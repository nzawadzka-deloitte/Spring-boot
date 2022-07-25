package com.dolittle.demo.carMaintenance.service;

import com.dolittle.demo.carMaintenance.entity.CarEntity;
import com.dolittle.demo.carMaintenance.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {

    private final CarRepository carRepository;


    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public List<CarEntity> getCarService() {
        return carRepository.findAll();
    }

    public void addNewCar(CarEntity carEntity) {
        carRepository.save(carEntity);
    }

    public void deleteCar(Long id){
        boolean exist = carRepository.existsById(id);
        if(!exist){
            throw new IllegalStateException("Car with this id does not exist");
        }
        carRepository.deleteById(id);
    }
}
