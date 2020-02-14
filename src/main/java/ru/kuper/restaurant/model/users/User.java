package ru.kuper.restaurant.model.users;

import lombok.Getter;
import lombok.Setter;
import ru.kuper.restaurant.model.enums.Post;
import ru.kuper.restaurant.model.orders.Order;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User implements IUser {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Post Post;

//    @OneToOne(mappedBy = "user", cascade = CascadeType.REMOVE)
//    private Order order;

    public User(String name, Post post) {
        this.name = name;
        Post = post;
    }

    public User() {

    }

}
