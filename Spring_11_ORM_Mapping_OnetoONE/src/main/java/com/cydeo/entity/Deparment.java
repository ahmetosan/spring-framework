package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "depertments")
@NoArgsConstructor
@Data
public class Deparment extends BaseEntity{

    private String deperment;
    private String devision;

    public Deparment(String deperment, String devision) {
        this.deperment = deperment;
        this.devision = devision;
    }
}
