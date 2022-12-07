package com.online.shopping.FinalProject.service;

import com.online.shopping.FinalProject.dao.OrderRepo;
import com.online.shopping.FinalProject.dao.ProductsRepo;
import com.online.shopping.FinalProject.entity.Order;
import com.online.shopping.FinalProject.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    private final ProductsRepo productRepo;

    @Autowired
    public ProductService(ProductsRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Products addProduct(Products products){
        return productRepo.save(products);
    }

    public List<Products> findAllProducts(){
        return productRepo.findAll();
    }

    public List<Products> getByCategory(String category){ return productRepo.getByCategory( category);}
    public Products getById(int id){ return productRepo.findById(id).get(); }


    public Products updateProduct(Products products){
        return productRepo.save(products);
    }
    public void deleteProduct(int id){
        productRepo.deleteProductsById(id);
    }



}
