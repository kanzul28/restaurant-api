package com.spring.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="customers")
public class Customer {

    @Id
    private String id;
    @JsonIgnore
    private String name;


    public Customer(String name){
        this.name = name;
    }

}
