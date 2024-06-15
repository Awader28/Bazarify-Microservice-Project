package com.bazarify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazarify.model.Shipping;
import com.bazarify.repository.ShippingRepository;

@Service
public class ShippingService {
    
    @Autowired    
    private ShippingRepository repo;

    public List<Shipping> getShippingByOrderId(Long orderId) {
        return repo.findByOrderId(orderId);  // Correct method name
    }

    public Shipping createShipping(Shipping shipping) {
        return repo.save(shipping);
    }

    public void deleteShipping(Long id) {
        repo.deleteById(id);
    }
}
