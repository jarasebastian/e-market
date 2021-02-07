package com.project.emarket.persistence.mapper;

import com.project.emarket.domain.dto.PurchaseItemDTO;
import com.project.emarket.persistence.entity.PurchasesProduct;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.productId", target = "productId"),
            @Mapping(source = "status", target = "active"),
    })
    PurchaseItemDTO toPurchaseItem(PurchasesProduct product);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "purchase", ignore = true),
            @Mapping(target = "product", ignore = true),
            @Mapping(target = "id.purchaseId", ignore = true),
    })
    PurchasesProduct toPurchasesProduct(PurchaseItemDTO purchaseItemDTO);
}
