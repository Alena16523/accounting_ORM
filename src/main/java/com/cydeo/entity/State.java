package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "state")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class State extends BaseEntity{

    private String stateCode;
    private String stateName;

    @OneToOne(mappedBy = "address")
    private Address address;

    public State(String stateCode, String stateName) {
        this.stateCode = stateCode;
        this.stateName = stateName;
    }
}
