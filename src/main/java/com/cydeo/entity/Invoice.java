package com.cydeo.entity;

import com.cydeo.enums.Type;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Invoice extends BaseEntity{

    private LocalDate invoiceDate;
    private String invoiceNUmber;
    @Enumerated(EnumType.STRING)
    private Type invoiceType;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    public Invoice(LocalDate invoiceDate, String invoiceNUmber, Type invoiceType) {
        this.invoiceDate = invoiceDate;
        this.invoiceNUmber = invoiceNUmber;
        this.invoiceType = invoiceType;
    }
}
