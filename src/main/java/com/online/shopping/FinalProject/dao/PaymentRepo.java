package com.online.shopping.FinalProject.dao;


import com.online.shopping.FinalProject.entity.Payment_Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment_Details,Integer> {

}
