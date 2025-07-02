package com.example.Inventory.Mangement.System.repository;

import com.example.Inventory.Mangement.System.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT * FROM product ORDER BY product_name ASC", nativeQuery = true)
    List<Product> sortByName();
    @Query("SELECT p FROM Product p ORDER BY p.price ASC")
    List<Product> findAllByPriceAsc();

    List<Product> findByCategoryIgnoreCase(String category);


    @Query("SELECT SUM(p.price) FROM Product p WHERE p.category = :category")
    Integer sumPriceByCategory(@Param("category") String category);
}
