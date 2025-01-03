package com.d288.israel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Set;
import java.util.Date;

@Entity
@Table(name="cart")
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_tracking_number")
    private String orderTrackingNumber;

    @Column(name = "package_price")
    private BigDecimal packagePrice;

    @Column(name = "party_size")
    private int partySize;

    @Enumerated(EnumType.STRING) // Store the enum as a string
    @Column(name = "status")
    private StatusType status;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "customer_id") // Foreign key to Customer
    private Customer customer;

    @OneToMany(mappedBy = "cart")
    private Set<CartItem> cartItems;
}
