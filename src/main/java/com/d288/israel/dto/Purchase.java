package com.d288.israel.dto;

import com.d288.israel.entities.Cart;
import com.d288.israel.entities.CartItem;
import com.d288.israel.entities.Customer;
import lombok.Data;
import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}
