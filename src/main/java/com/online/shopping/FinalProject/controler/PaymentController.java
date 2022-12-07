package com.online.shopping.FinalProject.controler;

import com.online.shopping.FinalProject.entity.Payment_Details;
import com.online.shopping.FinalProject.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Payment_Details>> getAllPayments(){
        List<Payment_Details>payments= paymentService.findAllPayments();
        return  new ResponseEntity<>(payments, HttpStatus.OK);
    }
    @PostMapping("/add")
    public Payment_Details addPayment(@RequestBody Payment_Details payment){
        payment.setId(0);
        paymentService.addPayment(payment);
        return  payment;
    }

}
