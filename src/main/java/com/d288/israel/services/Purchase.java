package com.d288.israel.services;

import com.d288.israel.entities.Cart;
import com.d288.israel.entities.CartItem;
import com.d288.israel.entities.Customer;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class Purchase {
    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}
