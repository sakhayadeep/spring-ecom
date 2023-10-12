package com.sakhayadeep.ecom.service;

import com.sakhayadeep.ecom.entity.Customer;

import java.util.List;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public Customer getCustomerByEmail(String email);
    public Customer getCustomerById(Long id);
}
