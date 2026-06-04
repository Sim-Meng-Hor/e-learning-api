package com.istad.menghor.elearningproject.feature.course;

import com.istad.menghor.elearningproject.feature.category.Category;
import com.istad.menghor.elearningproject.feature.instructor.InstructorProfile;
import com.istad.menghor.elearningproject.feature.video.Video;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
    private String keyword; // use for SEO
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

    @OneToMany(mappedBy = "course")
    private List<Video> video;

   @ManyToOne
   @JoinColumn(name ="instructor_id")
    public InstructorProfile instructorProfile;

    private Boolean isPublished;
    private Boolean isDeleted;
}
