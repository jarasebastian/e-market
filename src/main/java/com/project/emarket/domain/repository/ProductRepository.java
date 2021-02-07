package com.project.emarket.domain.repository;

import com.project.emarket.domain.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<ProductDTO> getAll();
    Optional<List<ProductDTO>> getByCategory(int categoryId);
    Optional<List<ProductDTO>> getScarceProducts(int quantity);
    Optional<ProductDTO> getProduct(int productId);
    ProductDTO save(ProductDTO product);
    void delete(int productId);
}
