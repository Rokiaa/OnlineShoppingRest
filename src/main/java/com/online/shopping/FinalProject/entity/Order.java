package com.online.shopping.FinalProject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id")
    private Payment_Details payment_id;
/*
    @OneToOne(cascade = {CascadeType.REFRESH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REMOVE})
*/
   @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Products product_id;

    public Order(){}

    public Order( Payment_Details payment_id, Products product_id) {

        this.payment_id = payment_id;
        this.product_id = product_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Payment_Details getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Payment_Details payment_id) {
        this.payment_id = payment_id;
    }

    public Products getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Products product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", payment_id=" + payment_id +
                ", product_id=" + product_id +
                '}';
    }
}
