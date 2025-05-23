package com.example.kitchencraft.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many CartItems belong to one User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Many CartItems refer to one Product
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
}
