package com.online.shopping.FinalProject.service;

import com.online.shopping.FinalProject.dao.PaymentRepo;
import com.online.shopping.FinalProject.entity.Payment_Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PaymentService {
    private final PaymentRepo paymentRepo;
    @Autowired
    public PaymentService(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    public Payment_Details addPayment(Payment_Details payment){
        return paymentRepo.save(payment);
    }
    public List<Payment_Details> findAllPayments(){
        return paymentRepo.findAll();
    }

}
