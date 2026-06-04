package com.istad.menghor.elearningproject.feature.category;

import com.istad.menghor.elearningproject.feature.category.dto.CategoryCreateRequest;
import com.istad.menghor.elearningproject.feature.category.dto.CategoryResponse;
import org.springframework.data.domain.Page;




public interface CategoryService {

    Page<CategoryResponse> getAllCategories(Integer pageNumber, Integer pageSize);
    CategoryResponse getCategoryById(Integer id);

    CategoryResponse getAllCategoryById(Integer id);

    CategoryResponse saveCategory(CategoryCreateRequest categoryCreateRequest);

    CategoryResponse patchCategoryById(Integer id, CategoryCreateRequest categoryCreateRequest);

    void deleteCategoryById(Integer id);
}
