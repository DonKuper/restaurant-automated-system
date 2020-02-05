package ru.kuper.restaurant.service;

import ru.kuper.restaurant.model.Foodstuff;

import java.util.Optional;

public interface IFoodService {

    Optional findById(Long id);

    Iterable<Foodstuff> findAll();

    Foodstuff save(Foodstuff foodstuff);

    void deleteById(Long id);

}
