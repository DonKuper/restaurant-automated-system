package ru.kuper.restaurant.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Foodstuff {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    public Foodstuff(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Foodstuff(){

    }

}
