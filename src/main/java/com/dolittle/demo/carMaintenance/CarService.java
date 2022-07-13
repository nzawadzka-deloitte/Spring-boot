package com.dolittle.demo.carMaintenance;

import java.util.List;

import com.dolittle.carApp.carMaintenance.model.CarTO;

public interface CarService {

    List<CarTO> getAllCars();
}
