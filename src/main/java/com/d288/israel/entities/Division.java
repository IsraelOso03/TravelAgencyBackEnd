package com.d288.israel.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "divisions")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long id;

    @Column(name = "division")
    private String division_name;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
    private Set<Customer> customers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false, insertable = false, updatable = false)
    private Country country;

    @Column(name = "country_id")
    private long country_id;
    public void setCountry(Country country){
        setCountry_id((country.getId()));
        this.country = country;
    }

    public Long getId() {
        return this.id;
    }

    public String getDivision_name() {
        return this.division_name;
    }

    public Date getCreate_date() {
        return this.create_date;
    }

    public Date getLast_update() {
        return this.last_update;
    }

    public Set<Customer> getCustomers() {
        return this.customers;
    }

    public Country getCountry() {
        return this.country;
    }

    public long getCountry_id() {
        return this.country_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDivision_name(String division_name) {
        this.division_name = division_name;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public void setCountry_id(long country_id) {
        this.country_id = country_id;
    }
}