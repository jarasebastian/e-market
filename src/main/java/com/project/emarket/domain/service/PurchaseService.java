package com.project.emarket.domain.service;

import com.project.emarket.domain.dto.PurchaseDTO;
import com.project.emarket.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<PurchaseDTO> getAll(){
        return purchaseRepository.getAll();
    }

    public Optional<List<PurchaseDTO>> getByCustomer(String customerId){
        return purchaseRepository.getByCustomer(customerId);
    }

    public PurchaseDTO save(PurchaseDTO purchaseDTO){
        return purchaseRepository.save(purchaseDTO);
    }
}
