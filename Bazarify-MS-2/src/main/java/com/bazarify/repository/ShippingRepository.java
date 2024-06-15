package com.bazarify.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bazarify.model.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
    List<Shipping> findByOrderId(Long orderId);  // Correct method name to match the field name
}
