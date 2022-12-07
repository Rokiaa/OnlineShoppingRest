package com.online.shopping.FinalProject.service;

import com.online.shopping.FinalProject.dao.OrderRepo;
import com.online.shopping.FinalProject.entity.Order;
import com.online.shopping.FinalProject.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {
    private final OrderRepo orderRepo;
    @Autowired
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order addOrder(Order order){
        return orderRepo.save(order);
    }
    public List<Order> findAllOrders(){
        return orderRepo.findAll();
    }
    public Order getById(int id){ return orderRepo.findById(id).get(); }
    public void deleteOrder(int id){
        orderRepo.deleteOrderById(id);
    }
}
