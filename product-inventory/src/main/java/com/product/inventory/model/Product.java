package com.product.inventory.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Data // this adds @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity_in_stock", nullable = false)
    private int quantity;
}