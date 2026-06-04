package com.istad.menghor.elearningproject.feature.category;

import com.istad.menghor.elearningproject.feature.category.dto.CategoryCreateRequest;
import com.istad.menghor.elearningproject.feature.category.dto.CategoryResponse;
import org.hibernate.query.Page;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    Page<CategoryResponse> getAllCategories(Integer pageNumber, Integer pageSize);

    CategoryResponse getAllCategoryById(Integer id);

    CategoryResponse saveCategory(CategoryCreateRequest categoryCreateRequest);

    CategoryResponse patchCategoryById(Integer id, CategoryCreateRequest categoryCreateRequest);

    void deleteCategoryById(Integer id);
}
