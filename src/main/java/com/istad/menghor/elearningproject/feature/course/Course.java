package com.istad.menghor.elearningproject.feature.course;

import com.istad.menghor.elearningproject.feature.category.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String slug;
    private String keyword;
    private String title;
    private String description;
    private String thumbnail;
    private Float starRating;
    private Float totalHours;
    private String levels;
    private BigDecimal prices;
    private Float discountPercent;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;

    @ManyToOne
    private Category category;

}
