package com.istad.menghor.elearningproject.feature.instructor;

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
@Table(name = "instructor_profiles")
public class InstructorProfile {
    @Id
    private String userId;

    private String biography;
    private String jobTitle;
    private String phoneNumber;
    private String githubLink;
    private String facebookLink;


    @OneToMany(mappedBy = "instructorProfile")
    private List<Course> courses;
}
