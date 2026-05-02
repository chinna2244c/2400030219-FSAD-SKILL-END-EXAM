package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Delivery;
import com.klef.fsad.exam.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository repo;

    public Delivery addDelivery(Delivery d) {
        return repo.save(d);
    }

    public String deleteDelivery(Long id) {
        if(repo.existsById(id)) {
            repo.deleteById(id);
            return "Delivery with ID " + id + " deleted successfully.";
        } else {
            return "Delivery with ID " + id + " not found.";
        }
    }
}
