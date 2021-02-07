package com.project.emarket.persistence.crud;

import com.project.emarket.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    //@Query(value = "SELECT * FROM products WHERE category = ? ORDER BY name ASC", nativeQuery = true)
    List<Product> findByCategoryIdOrderByNameAsc(int categoryId);
    Optional<List<Product>> findByStockQuantityLessThanAndStatus(int stockQuantity, boolean status);
}
