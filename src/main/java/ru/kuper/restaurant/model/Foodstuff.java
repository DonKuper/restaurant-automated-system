package ru.kuper.restaurant.model;


import lombok.Getter;
import lombok.Setter;
import javax.*;
import javax.persistence.Entity;

@Entity
@Setter @Getter
public class Foodstuff extends SerializableModel {

     private String name;
     private String descrition;

    public Foodstuff(String name, String descrition) {
        this.name = name;
        this.descrition = descrition;
    }

}
