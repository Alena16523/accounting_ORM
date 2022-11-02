package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "invoice_product")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class InvoiceProduct extends BaseEntity{

    private BigDecimal profit;
    private Integer quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Invoice invoice;

    public InvoiceProduct(BigDecimal profit, Integer quantity) {
        this.profit = profit;
        this.quantity = quantity;
    }
}
