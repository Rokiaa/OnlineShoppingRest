package com.online.shopping.FinalProject.controler;

import com.online.shopping.FinalProject.entity.Order;
import com.online.shopping.FinalProject.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/orders")
public class OrdersController {
    private final OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllorders(){
        List<Order>orders= orderService.findAllOrders();
        return  new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order){
        order.setId(0);
        orderService.addOrder(order);
        return  order;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable("id") int id){
        orderService.deleteOrder(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Order> getById(@PathVariable int id){
        Order order= orderService.getById(id);
        return  new ResponseEntity<>(order, HttpStatus.OK);
    }

}
