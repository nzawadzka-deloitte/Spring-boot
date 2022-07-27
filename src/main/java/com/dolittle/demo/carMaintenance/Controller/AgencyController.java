package com.dolittle.demo.carMaintenance.Controller;

import com.dolittle.demo.carMaintenance.entity.AgencyEntity;
import com.dolittle.demo.carMaintenance.service.AgencyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgencyController {
    private final AgencyService agencyService;

    public AgencyController(AgencyService agencyService) {
        this.agencyService = agencyService;
    }

    @GetMapping(path="/agencies")
    public List<AgencyEntity> getAgencyService(){
        return agencyService.getAgencyService();
    }

    @PostMapping(path="/agencies/add")
    public void addNewAgency(@RequestBody AgencyEntity agencyEntity){
        agencyService.addNewAgency(agencyEntity);
    }
}