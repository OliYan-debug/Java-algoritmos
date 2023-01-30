package com.xiaomi.technology.smartphone.service;
import com.xiaomi.technology.smartphone.model.Smartphone;
import com.xiaomi.technology.smartphone.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneServiceImplementation implements SmartphoneService{

    private final SmartphoneRepository smartphoneRepository;
    @Autowired
    public SmartphoneServiceImplementation(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    public List<Smartphone> getSmartphones(){
        return smartphoneRepository.findAll();
    }
}
