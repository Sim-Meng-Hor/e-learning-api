package com.istad.menghor.elearningproject.feature.category.mapper;

import com.istad.menghor.elearningproject.feature.category.Category;
import com.istad.menghor.elearningproject.feature.category.dto.CategoryCreateRequest;
import com.istad.menghor.elearningproject.feature.category.dto.CategoryResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryResponse mapToResponse(Category category);

    Category mapToEntity(CategoryCreateRequest categoryCreateRequest);
}
