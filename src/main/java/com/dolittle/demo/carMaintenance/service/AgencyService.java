package com.dolittle.demo.carMaintenance.service;

import com.dolittle.demo.carMaintenance.model.AgencyTO;
import com.dolittle.demo.carMaintenance.model.CarTO;

import java.util.List;



public interface AgencyService {

    List<AgencyTO> getAllAgencies();
}
