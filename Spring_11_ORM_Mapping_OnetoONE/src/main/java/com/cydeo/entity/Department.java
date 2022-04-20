package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "depertments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity{

    private String deperment;
    private String devision;


    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department(String deperment, String devision) {
        this.deperment = deperment;
        this.devision = devision;
    }
}
