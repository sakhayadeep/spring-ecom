package com.sakhayadeep.ecom.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "product")
public class ProductLineItem {
    @Id
    @SequenceGenerator(
            name = "product_line_item_sequence",
            sequenceName = "product_line_item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_line_item_sequence"
    )
    private Long lineItemId;


    @Column(nullable = false)
    private Integer quantity;

    private BigDecimal price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "productId"
    )
    private Product product;
}
