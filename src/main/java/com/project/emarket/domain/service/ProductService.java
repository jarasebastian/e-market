package com.project.emarket.domain.service;

import com.project.emarket.domain.dto.ProductDTO;
import com.project.emarket.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAll(){
        return productRepository.getAll();
    }

    public Optional<ProductDTO> getProduct(int productId){
        return productRepository.getProduct(productId);
    }

    public Optional<List<ProductDTO>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }

    public ProductDTO save(ProductDTO productDTO){
        return productRepository.save(productDTO);
    }

    public boolean delete(int productId){
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }
}
