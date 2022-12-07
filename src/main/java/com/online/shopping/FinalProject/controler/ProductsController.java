package com.online.shopping.FinalProject.controler;

import com.online.shopping.FinalProject.entity.Products;
import com.online.shopping.FinalProject.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/products")
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Products>> getAllProducts(){
        List<Products>products= productService.findAllProducts();
        return  new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/category/{cat}")
    public ResponseEntity<List<Products>> getByCategory(@PathVariable String cat){
        List<Products>products= productService.getByCategory(cat);
        return  new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/add")
    public Products addProduct(@RequestBody Products products){
        products.setId(0);
        productService.addProduct(products);
        return  products;
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Products> getById(@PathVariable int id){
        Products products= productService.getById(id);
        return  new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Products> updateProduct(@RequestBody Products products){
        Products updateProduct = productService.updateProduct(products);
        return  new ResponseEntity<>(updateProduct, HttpStatus.OK);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") int id){
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
