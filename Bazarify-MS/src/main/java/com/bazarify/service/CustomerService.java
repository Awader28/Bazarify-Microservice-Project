package com.bazarify.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazarify.client.ShippingClient;
import com.bazarify.dto.ShippingDTO;
import com.bazarify.model.Customer;
import com.bazarify.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ShippingClient shippingClient;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Optional<Customer> getCustomerById(Long id) {
		return customerRepository.findById(id);
	}

	public List<ShippingDTO> getShippingByOrderId(Long orderId) {
		return shippingClient.getShippingByOrderId(orderId);
	}

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
	}
}
