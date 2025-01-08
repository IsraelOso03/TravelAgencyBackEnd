package com.d288.israel.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long id;

    @Column(name = "package_price")
    private BigDecimal package_price;

    @Column(name = "party_size")
    private int party_size;

    @Column(name = "order_tracking_number")
    private String orderTrackingNumber;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    private Set<CartItem> cartItems = new HashSet<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusType status;

    public void add(CartItem item) {
        cartItems.add(item);
                item.setCart(this);
    }

    public Long getId() {
        return this.id;
    }

    public BigDecimal getPackage_price() {
        return this.package_price;
    }

    public int getParty_size() {
        return this.party_size;
    }

    public String getOrderTrackingNumber() {
        return this.orderTrackingNumber;
    }

    public Date getCreate_date() {
        return this.create_date;
    }

    public Date getLast_update() {
        return this.last_update;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Set<CartItem> getCartItems() {
        return this.cartItems;
    }

    public StatusType getStatus() {
        return this.status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPackage_price(BigDecimal package_price) {
        this.package_price = package_price;
    }

    public void setParty_size(int party_size) {
        this.party_size = party_size;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }
}
