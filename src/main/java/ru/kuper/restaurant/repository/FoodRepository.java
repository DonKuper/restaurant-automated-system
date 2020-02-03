package ru.kuper.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kuper.restaurant.model.Foodstuff;

public interface FoodRepository extends CrudRepository<Foodstuff, Long> {

}
