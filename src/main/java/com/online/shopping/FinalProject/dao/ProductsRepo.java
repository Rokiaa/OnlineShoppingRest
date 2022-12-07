package com.online.shopping.FinalProject.dao;

import com.online.shopping.FinalProject.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductsRepo extends JpaRepository<Products,Integer> {

    public List<Products> getByCategory(String category);
    @Transactional
    public void deleteProductsById(int id);

}
