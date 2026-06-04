package com.istad.menghor.elearningproject.feature.category.dto;
import org.springframework.data.domain.Page;

import lombok.Builder;

@Builder
public record CategoryResponse(
   Integer id,
   String name,
   String icon
) {}
