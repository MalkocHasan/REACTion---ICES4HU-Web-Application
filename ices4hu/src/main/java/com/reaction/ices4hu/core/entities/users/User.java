package com.reaction.ices4hu.core.entities.users;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = "user_type")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;

    @NotBlank
    @Column(name = "password")
    private String password;

    @NotBlank
    @Column(name = "email")
    private String email;

    @Column(name = "phoneNumber")
    private Long phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

}
