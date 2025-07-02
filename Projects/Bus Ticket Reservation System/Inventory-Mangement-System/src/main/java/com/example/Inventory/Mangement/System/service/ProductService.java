package com.example.Inventory.Mangement.System.service;

import com.example.Inventory.Mangement.System.model.Product;
import com.example.Inventory.Mangement.System.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public String addProduct(Product product) {
        productRepo.save(product);
        return "Product added...;";
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public List<Product> sortByName() {
        return productRepo.sortByName();
    }

    public List<Product> filter() {
        return productRepo.findAllByPriceAsc();
    }

    public List<Product> searchByCategory(String category) {
        return productRepo.findByCategoryIgnoreCase(category);
    }

    public int calculateSum(String category) {
        Integer res = productRepo.sumPriceByCategory(category);
        if(res == null) return 0;
        return res;
    }
}
