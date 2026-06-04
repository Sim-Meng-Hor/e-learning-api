package com.istad.menghor.elearningproject.feature.category;

import com.istad.menghor.elearningproject.feature.category.dto.CategoryCreateRequest;
import com.istad.menghor.elearningproject.feature.category.dto.CategoryResponse;
import com.istad.menghor.elearningproject.feature.category.mapper.CategoryMapper;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryMapper categoryMapper,
                               CategoryRepository categoryRepository){
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Page<CategoryResponse> getAllCategories(Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public CategoryResponse getCategoryById(Integer id) {
        return null;
    }

    @Override
    public CategoryResponse getAllCategoryById(Integer id) {
        return null;
    }

    @Override
    public CategoryResponse saveCategory(CategoryCreateRequest categoryCreateRequest) {
        Category newCategory = categoryMapper.mapToEntity(categoryCreateRequest);
        return categoryMapper.mapToResponse(categoryRepository.save(newCategory));
    }

    @Override
    public CategoryResponse patchCategoryById(Integer id, CategoryCreateRequest categoryCreateRequest) {
        if (!categoryRepository.existsById(id)){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Id not found"
            );
        }

        Category updateCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Id not found"
                ));

        if (categoryCreateRequest.name() != null){
            updateCategory.setName(categoryCreateRequest.name());
        }

        if (categoryCreateRequest.icon() != null){
            updateCategory.setIcon(categoryCreateRequest.icon());
        }


        return categoryMapper.mapToResponse(categoryRepository.save(updateCategory));
    }

    @Override
    public void deleteCategoryById(Integer id) {
        if (!categoryRepository.existsById(id)){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Id not found");
        }
        categoryRepository.deleteById(id);

    }
}
