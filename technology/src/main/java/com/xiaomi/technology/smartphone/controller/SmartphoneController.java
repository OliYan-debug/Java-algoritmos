package com.xiaomi.technology.smartphone.controller;


import com.xiaomi.technology.smartphone.model.Smartphone;
import com.xiaomi.technology.smartphone.service.SmartphoneServiceImplementation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/smartphones")
public class SmartphoneController {
    SmartphoneServiceImplementation smartphoneServiceImplementation;
    @RequestMapping("")
    public List<Smartphone> getSmartphones(){
        return smartphoneServiceImplementation.getSmartphones();
    }


}
