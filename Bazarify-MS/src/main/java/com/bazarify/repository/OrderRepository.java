package com.bazarify.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bazarify.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
