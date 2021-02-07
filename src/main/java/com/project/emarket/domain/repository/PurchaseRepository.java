package com.project.emarket.domain.repository;

import com.project.emarket.domain.dto.PurchaseDTO;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<PurchaseDTO> getAll();
    Optional<List<PurchaseDTO>> getByCustomer(String customerId);
    PurchaseDTO save(PurchaseDTO purchaseDTO);

}
