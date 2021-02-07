package com.project.emarket.persistence;

import com.project.emarket.domain.dto.PurchaseDTO;
import com.project.emarket.persistence.entity.Purchase;
import com.project.emarket.domain.repository.PurchaseRepository;
import com.project.emarket.persistence.crud.PurchaseCrudRepository;
import com.project.emarket.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PurchaseRepositoryImpl implements PurchaseRepository {

    @Autowired
    private PurchaseCrudRepository purchaseCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<PurchaseDTO> getAll() {
        return mapper.toPurchasesDTO((List<Purchase>) purchaseCrudRepository.findAll());
    }

    @Override
    public Optional<List<PurchaseDTO>> getByCustomer(String customerId) {
        return purchaseCrudRepository.findByCustomerId(customerId)
                .map(purchases -> mapper.toPurchasesDTO(purchases));
    }

    @Override
    public PurchaseDTO save(PurchaseDTO purchaseDTO) {
        Purchase purchase = mapper.toPurchase(purchaseDTO);
        purchase.getProducts().forEach(product -> product.setPurchase(purchase));
        return mapper.toPurchaseDTO(purchaseCrudRepository.save(purchase));
    }
}
