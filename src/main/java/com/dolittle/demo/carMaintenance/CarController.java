package com.dolittle.demo.carMaintenance;

import java.util.List;

import com.dolittle.demo.carMaintenance.model.CarTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<CarTO> getAllCars() {
        return carService.getAllCars();
    }
}
