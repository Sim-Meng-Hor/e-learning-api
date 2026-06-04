package com.istad.menghor.elearningproject.feature.category;

import com.istad.menghor.elearningproject.feature.category.dto.CategoryResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;





}
