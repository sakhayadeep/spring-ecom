package com.sakhayadeep.ecom.repository;

import com.sakhayadeep.ecom.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAll();
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByFirstNameContaining(String name);
    List<Customer> findByLastNameNotNull();
    List<Customer> findByFirstNameOrLastName(String firstName, String lastName);
    List<Customer> findByCustomerAddresses_State(String state);

    Customer findByCustomerId(Long id);
    Customer findByEmailId(String email);

    // JPQL Query
    @Query("select c from Customer c where c.emailId = ?1")
    Customer getCustomerByEmailAddress(String emailId);

    // SQL Query
    @Query(
            value="select * from customer where email_id = ?1",
            nativeQuery = true
    )
    Customer getCustomerByEmailAddressNative(String emailId);

/*
    SQL Query but using the named parameters
    @Query(
            value="select * from customer where email_id = :emailId",
            nativeQuery = true
    )
    Customer getCustomerByEmailAddressNative(@Param("emailId") String emailId);
*/
    @Modifying
    @Transactional
    @Query(
            value="update customer set first_name = ?1 where email_id = ?2",
            nativeQuery = true
    )
    int updateCustomerNameByEmailId(String firstName, String emailId);
}
