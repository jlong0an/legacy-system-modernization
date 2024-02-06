package com.example.D288.controllers;

import com.example.D288.dto.Purchase;
import com.example.D288.dto.PurchaseResponse;
import com.example.D288.services.Checkout;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private Checkout checkout;
    public CheckoutController(Checkout checkout) {
        this.checkout = checkout;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkout.placeOrder(purchase);
        return purchaseResponse;
    }
}
