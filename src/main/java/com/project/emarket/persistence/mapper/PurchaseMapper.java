package com.project.emarket.persistence.mapper;

import com.project.emarket.domain.dto.PurchaseDTO;
import com.project.emarket.persistence.entity.Purchase;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "status",target = "active"),
            @Mapping(source = "products",target = "items"),
    })
    PurchaseDTO toPurchaseDTO(Purchase purchase);
    List<PurchaseDTO> toPurchasesDTO(List<Purchase> purchases);

    @InheritInverseConfiguration
    @Mapping(target = "customer", ignore = true)
    Purchase toPurchase(PurchaseDTO purchaseDTO);
}
