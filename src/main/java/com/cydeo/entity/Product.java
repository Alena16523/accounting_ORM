package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Product extends BaseEntity{

    private String name;
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
