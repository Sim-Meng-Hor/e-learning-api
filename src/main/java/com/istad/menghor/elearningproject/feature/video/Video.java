package com.istad.menghor.elearningproject.feature.video;

import com.istad.menghor.elearningproject.feature.comment.Comment;
import com.istad.menghor.elearningproject.feature.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String slug;
    private String thumbnail;
    private String duration;

    private String youtube;

    private Boolean isDeleted;
    private Boolean isPublished;

    @ManyToOne
    private Course course;

    @OneToMany(mappedBy = "video")
    private List<Comment> comment;
}
