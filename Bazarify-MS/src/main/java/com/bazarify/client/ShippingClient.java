package com.bazarify.client;

import com.bazarify.dto.ShippingDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "shipping-service", url = "http://localhost:8081") // Change the URL to your actual Shipping service URL
public interface ShippingClient {

    @GetMapping("/shippings/order/{orderId}")
    List<ShippingDTO> getShippingByOrderId(@PathVariable("orderId") Long orderId);
}
