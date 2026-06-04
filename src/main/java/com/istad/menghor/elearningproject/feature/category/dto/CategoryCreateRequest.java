package com.istad.menghor.elearningproject.feature.category.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryCreateRequest(
        @NotBlank(message = "Name is required")
        @Size(min = 50, max = 255)
        String name,


        String icon
) {}
