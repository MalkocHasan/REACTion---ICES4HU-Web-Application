package com.reaction.ices4hu.core.entities.users;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.reaction.ices4hu.core.entities.Course;
import com.reaction.ices4hu.core.entities.Survey;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@DiscriminatorValue("Instructor")
public class Instructor extends User {

    @Column(name = "departmentName")
    private String departmentName;

    @OneToMany(mappedBy = "instructor")
    @JsonBackReference
    private List<Course> courses;

    @ManyToMany(mappedBy = "instructors")
    @JsonBackReference
    private List<Survey> surveys;


}
