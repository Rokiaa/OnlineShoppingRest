package com.online.shopping.FinalProject.dao;

import com.online.shopping.FinalProject.entity.Order;
import com.online.shopping.FinalProject.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface OrderRepo extends JpaRepository<Order,Integer> {
    @Transactional
    public void deleteOrderById(int id);

}
