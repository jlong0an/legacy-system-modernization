package com.example.D288.dto;

import com.example.D288.entities.Cart;
import com.example.D288.entities.CartItem;
import com.example.D288.entities.Customer;
import lombok.Data;
import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;

}