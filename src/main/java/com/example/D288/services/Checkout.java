package com.example.D288.services;

import com.example.D288.dto.Purchase;
import com.example.D288.dto.PurchaseResponse;

public interface Checkout {
    PurchaseResponse placeOrder(Purchase purchase);
}