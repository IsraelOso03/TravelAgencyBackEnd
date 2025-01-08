package com.d288.israel.services;

import com.d288.israel.dto.Purchase;
import com.d288.israel.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
