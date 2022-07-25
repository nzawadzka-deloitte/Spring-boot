package com.dolittle.demo.carMaintenance.service;

import java.util.List;
import java.util.stream.Collectors;


import com.dolittle.demo.carMaintenance.DAO.CarDAO;
import com.dolittle.demo.carMaintenance.entity.CarEntity;
import com.dolittle.demo.carMaintenance.model.CarTO;
import com.dolittle.demo.carMaintenance.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl extends CarService {

    @Autowired
    private CarDAO carDAO;

    public CarServiceImpl(CarRepository carRepository) {
        super(carRepository);
    }



    private CarTO mapToCarTO(CarEntity carEntity) {
        return new CarTO(carEntity.getId(), carEntity.getModel(), carEntity.getName());
    }
}
