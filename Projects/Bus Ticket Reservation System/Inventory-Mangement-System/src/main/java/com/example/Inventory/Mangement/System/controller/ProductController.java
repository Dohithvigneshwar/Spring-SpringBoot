package com.example.Inventory.Mangement.System.controller;

import com.example.Inventory.Mangement.System.model.Product;
import com.example.Inventory.Mangement.System.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/addproduct")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("/getproducts")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    @GetMapping("/sortproduct")
    public List<Product> sortByName(){
        return productService.sortByName();
    }
    @GetMapping("/filter")
    public List<Product> filter(){
        return productService.filter();
    }
    @GetMapping("/searchbycategory/{category}")
    public List<Product> searchByCategory(@PathVariable String category) {
        return productService.searchByCategory(category);
    }

    @GetMapping("/calculate/{category}")
    public int calculateSum(@PathVariable String category) {
        return productService.calculateSum(category);
    }
}
