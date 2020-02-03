package ru.kuper.restaurant.model;


import lombok.Getter;
import lombok.Setter;
import javax.*;
import javax.persistence.Entity;

@Entity
@Setter @Getter
public class Foodstuff extends SerializableModel {

     private String name;
     private String description;

    public Foodstuff(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
