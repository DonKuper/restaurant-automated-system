package ru.kuper.restaurant.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.kuper.restaurant.model.enums.DeliverState;
import ru.kuper.restaurant.model.enums.OnKitchenState;
import ru.kuper.restaurant.model.enums.Units;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Foodstuff implements IFoodstuff {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Double quantity_for_deliver;

    @Enumerated(EnumType.STRING)
    private DeliverState deliver_state;

    @Enumerated(EnumType.STRING)
    private OnKitchenState on_kitchen_state;

    @Enumerated(EnumType.STRING)
    private Units unit;

    public Foodstuff(String name, Double price) {
        this.name = name;
        this.price = price;
        this.quantity_for_deliver = 1.0;
        this.unit = Units.KG;
        this.deliver_state = DeliverState.DOESNT_NEED_TO_BE_PURCHASED;
        this.on_kitchen_state = OnKitchenState.INNESSCESSARY;
    }

    public Foodstuff(){

    }

}
