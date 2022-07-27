package com.dolittle.demo.carMaintenance.Controller;

import com.dolittle.demo.carMaintenance.entity.CarEntity;
import com.dolittle.demo.carMaintenance.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(path="/cars")
    public List<CarEntity> getCarService(){
        return carService.getCarService();
    }
    @PostMapping(path="/cars/add")
    public void addNewCar(@RequestBody CarEntity carEntity){
        carService.addNewCar(carEntity);
    }
    @DeleteMapping(path="/cars/delete/{carId}")
    public void deleteCar(@PathVariable("carId") Long id){
        carService.deleteCar(id);
    }

}
