package com.dolittle.demo.carMaintenance.service;

import com.dolittle.demo.carMaintenance.model.CarRentTO;
import com.dolittle.demo.carMaintenance.model.CarTO;

import java.util.List;



public interface CarRentService {

    List<CarRentTO> getAllCarsRent();
}
