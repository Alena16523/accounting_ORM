package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Address extends BaseEntity{

    private String description;
    private String zipCode;

    @ManyToOne
    private State state;

    public Address(String description, String zipCode) {
        this.description = description;
        this.zipCode = zipCode;
    }
}
