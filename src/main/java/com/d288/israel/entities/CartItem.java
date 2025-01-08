package com.d288.israel.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToMany(mappedBy = "cartItems")
    private Set<Excursion> excursions;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

    public Long getId() {
        return this.id;
    }

    public Date getCreate_date() {
        return this.create_date;
    }

    public Date getLast_update() {
        return this.last_update;
    }

    public Cart getCart() {
        return this.cart;
    }

    public Set<Excursion> getExcursions() {
        return this.excursions;
    }

    public Vacation getVacation() {
        return this.vacation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setExcursions(Set<Excursion> excursions) {
        this.excursions = excursions;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }
}