package com.istad.menghor.elearningproject.feature.category.mapper;

import com.istad.menghor.elearningproject.feature.category.Category;
import com.istad.menghor.elearningproject.feature.category.dto.CategoryCreateRequest;
import com.istad.menghor.elearningproject.feature.category.dto.CategoryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryResponse mapToResponse(Category category);


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isDeleted", constant = "false")
    @Mapping(target = "courses", ignore = true)
    Category mapToEntity(CategoryCreateRequest categoryCreateRequest);
}
