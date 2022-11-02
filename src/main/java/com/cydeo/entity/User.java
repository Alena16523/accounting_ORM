package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User extends BaseEntity{

    private String email;
    @Column(name = "firstname")
    private String firstName;
    private String lastname;
    private String password;

    @ManyToOne
    private Role role;

    public User(String email, String firstName, String lastname, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastname = lastname;
        this.password = password;
    }
}
