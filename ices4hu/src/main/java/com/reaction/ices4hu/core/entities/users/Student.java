package com.reaction.ices4hu.core.entities.users;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Student")
public class Student extends User {

    @Column(name = "studentId")
    private Long studentId;

    @Column(name = "departmentName")
    private String departmentName;

}
