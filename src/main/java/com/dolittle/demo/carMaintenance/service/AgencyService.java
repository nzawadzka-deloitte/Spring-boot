package com.dolittle.demo.carMaintenance.service;

import com.dolittle.demo.carMaintenance.entity.AgencyEntity;
import com.dolittle.demo.carMaintenance.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyService {

    private final AgencyRepository agencyRepository;
    @Autowired
    public AgencyService(AgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    public List<AgencyEntity> getAgencyService(){
        return agencyRepository.findAll();
    }

    public void addNewAgency(AgencyEntity agencyEntity) {
        agencyRepository.save(agencyEntity);
    }
    public void deleteAgency(Long id){
        boolean exist = agencyRepository.existsById(id);
        if(!exist){
            throw new IllegalStateException("Agency with this id does not exist");
        }
    }
}