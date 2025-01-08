package com.d288.israel.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "excursions")
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long id;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "excursion_price")
    private BigDecimal excursion_price;

    @Column(name = "excursion_title")
    private String excursion_title;

    @Column(name = "image_url")
    private String image_URL;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

//    @ManyToMany
//    @JoinTable(name = "excursion_cartitem",
//            joinColumns = @JoinColumn(name = "excursion_id"),
//            inverseJoinColumns = @JoinColumn(name = "cart_item_id"))
//    private Set<CartItem> cartItems;
    @ManyToMany(mappedBy = "excursions") // 'excursions' is the field in CartItem
    private Set<CartItem> cartItems;


    public Long getId() {
        return this.id;
    }

    public Date getCreate_date() {
        return this.create_date;
    }

    public BigDecimal getExcursion_price() {
        return this.excursion_price;
    }

    public String getExcursion_title() {
        return this.excursion_title;
    }

    public String getImage_URL() {
        return this.image_URL;
    }

    public Date getLast_update() {
        return this.last_update;
    }

    public Vacation getVacation() {
        return this.vacation;
    }

    public Set<CartItem> getCartItems() {
        return this.cartItems;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public void setExcursion_price(BigDecimal excursion_price) {
        this.excursion_price = excursion_price;
    }

    public void setExcursion_title(String excursion_title) {
        this.excursion_title = excursion_title;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}