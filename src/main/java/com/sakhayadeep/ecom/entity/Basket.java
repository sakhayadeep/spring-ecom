package com.sakhayadeep.ecom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Basket {
    @Id
    @SequenceGenerator(
            sequenceName = "basket_sequence",
            name = "basket_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "basket_sequence"
    )
    private Long basketId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "shipping_address_id")
    private CustomerAddress shippingAddress;

    @OneToOne
    @JoinColumn(name = "billing_address_id")
    private CustomerAddress billingAddress;
}
