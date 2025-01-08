package com.d288.israel.services;

import com.d288.israel.dao.CartRepository;
import com.d288.israel.dao.CustomerRepository;
import com.d288.israel.dto.Purchase;
import com.d288.israel.dto.PurchaseResponse;
import com.d288.israel.entities.Cart;
import com.d288.israel.entities.CartItem;
import com.d288.israel.entities.Customer;
import com.d288.israel.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;
    private CartRepository cartRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository, CartRepository cartRepository) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        Cart cart = purchase.getCart();

        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        Set<CartItem> cartItems = purchase.getCartItems();
//        cartItems.forEach(cart::add);
        for(CartItem cartItem : cartItems){
            cart.add(cartItem);
        }

//        cart.setCartItems(cartItems);
//        cart.setCustomer(purchase.getCustomer());

        cart.setStatus(StatusType.ordered);

        cartRepository.save(cart);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {

        return UUID.randomUUID().toString();
    }
}
