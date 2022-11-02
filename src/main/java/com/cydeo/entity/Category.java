package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "categories")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Category extends BaseEntity {

    private String categoryName;
    private BigDecimal tax;

}
