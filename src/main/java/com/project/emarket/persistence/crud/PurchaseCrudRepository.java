package com.project.emarket.persistence.crud;

import com.project.emarket.persistence.entity.Purchase;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseCrudRepository extends CrudRepository<Purchase, Integer> {

    Optional<List<Purchase>> findByCustomerId(String customerId);
}
