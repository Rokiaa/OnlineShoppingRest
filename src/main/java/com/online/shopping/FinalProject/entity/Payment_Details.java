package com.online.shopping.FinalProject.entity;

import javax.persistence.*;

@Entity
@Table(name = "payment_details")
public class Payment_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "total")
    private int total;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Order order_id;
    @OneToOne(cascade = {CascadeType.REFRESH,CascadeType.MERGE,CascadeType.DETACH})
    @JoinColumn(name = "user_id")
    private User user_id;

    public Payment_Details(){}

    public Payment_Details( int total, Order order_id, User user_id) {

        this.total = total;
        this.order_id = order_id;
        this.user_id = user_id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Payment_Details{" +
                "id=" + id +
                ", total=" + total +
                ", order_id=" + order_id +
                ", user_id=" + user_id +
                '}';
    }
}
