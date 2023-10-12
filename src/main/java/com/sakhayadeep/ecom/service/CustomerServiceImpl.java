package com.sakhayadeep.ecom.service;

import com.sakhayadeep.ecom.repository.CustomerRepository;
import com.sakhayadeep.ecom.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerByEmail(String email) { return customerRepository.findByEmailId(email); }

    @Override
    public Customer getCustomerById(Long id) { return customerRepository.findByCustomerId(id); }
}
