package com.sakhayadeep.ecom.repository;

import com.sakhayadeep.ecom.entity.Customer;
import com.sakhayadeep.ecom.entity.CustomerAddress;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@DataJpaTest
@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

//    @Test
//    public void saveCustomer() {
//        Customer customer = Customer.builder()
//                .emailId("test1@test.com")
//                .firstName("Elon")
//                .lastName("Musk")
////                .address1("1 Tesla Road")
////                .city("Austin")
////                .state("TX")
////                .phone("9876543210")
////                .zipcode("78725")
//                .build();
//        customerRepository.save(customer);
//    }

//    @Test
//    public void saveCustomerWithAddress() {
//        CustomerAddress customerAddress = CustomerAddress.builder()
//                .address1("1 Tesla Road")
//                .city("Austin")
//                .state("TX")
//                .phone("9876543210")
//                .zipcode("78725")
//                .build();
//        Customer customer = Customer.builder()
//                .firstName("Elon")
//                .lastName("Musk")
//                .emailId("test2@test.com")
//                .build();
//        customerRepository.save(customer);
//    }
//
//    @Test
//    public void printAllCustomer() {
//        List<Customer> customerList = customerRepository.findAll();
//        System.out.println("customerList = " + customerList);
//    }
//
//    @Test
//    public void printCustomerByFirstName() {
//        List<Customer> customers = customerRepository.findByFirstName("Elon");
//        System.out.println("customer = " + customers);
//    }
//
//    @Test
//    public void printCustomerByFirstNameContaining() {
//        List<Customer> customers = customerRepository.findByFirstNameContaining("El");
//        System.out.println("customer = " + customers);
//    }
//
//    @Test
//    public void printCustomerBasedOnState() {
//        List<Customer> customers = customerRepository.findByCustomerAddresses_State("TX");
//        System.out.println("Customer = " + customers);
//    }
//
//    @Test
//    public void printCustomerByFirstNameOrLastName() {
//        List<Customer> customers = customerRepository.findByFirstNameOrLastName("Talon", "Musk");
//        System.out.println("Customer = " + customers);
//    }
//
//    @Test
//    public void printCustomerByEmailAddress(){
//        Customer customer = customerRepository.getCustomerByEmailAddress(
//                "test@test.com"
//        );
//        System.out.println("Customer = " + customer);
//    }
//
//    @Test
//    public void printCustomerByEmailAddressNative(){
//        Customer customer = customerRepository.getCustomerByEmailAddressNative(
//                "test1@test.com"
//        );
//        System.out.println("Customer = " + customer);
//    }
}