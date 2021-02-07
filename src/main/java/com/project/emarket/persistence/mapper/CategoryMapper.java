package com.project.emarket.persistence.mapper;

import com.project.emarket.domain.dto.CategoryDTO;
import com.project.emarket.persistence.entity.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "description", target = "category"),
            @Mapping(source = "status", target = "active"),
    })
    CategoryDTO toCategoryDTO(Category category);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    Category toCategory(CategoryDTO categoryDTO);
}
