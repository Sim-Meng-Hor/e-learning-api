package com.istad.menghor.elearningproject.feature.category;

import com.istad.menghor.elearningproject.feature.category.dto.CategoryCreateRequest;
import com.istad.menghor.elearningproject.feature.category.dto.CategoryResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Page<CategoryResponse> getAllCategories(@RequestParam(required = false, defaultValue = "0") Integer pageNumber,
                                                   @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return categoryService.getAllCategories(pageNumber, pageSize);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryResponse getCategoryById(@PathVariable Integer id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse createNewCategory(@Valid  @RequestBody CategoryCreateRequest createCategoryRequest) {
        return categoryService.saveCategory(createCategoryRequest);
    }

    @PatchMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryResponse patchCategoryById(@PathVariable Integer id, @Valid
                                              @RequestBody CategoryCreateRequest categoryCreateRequest) {
        return categoryService.patchCategoryById(id, categoryCreateRequest);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategoryById(@PathVariable Integer id) {
        categoryService.deleteCategoryById(id);
    }
}