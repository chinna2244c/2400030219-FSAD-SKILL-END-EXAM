package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.Delivery;
import com.klef.fsad.exam.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService service;

    @PostMapping("/add")
    public Delivery add(@RequestBody Delivery d) {
        return service.addDelivery(d);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteDelivery(id);
    }
}
