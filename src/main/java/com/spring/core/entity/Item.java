package com.spring.core.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="items")
public class Item {

    @Id
    private String id;
    private String name;
    private BigDecimal price;
}
