package ru.kuper.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuper.restaurant.model.Foodstuff;
import ru.kuper.restaurant.repository.FoodRepository;

import java.util.Optional;

@Service
public class FoodService implements IFoodService {

    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public Optional findById(Long id) {
        return foodRepository.findById(id);
    }

    @Override
    public Foodstuff save(Foodstuff foodstuff) {
        return foodRepository.save(foodstuff);
    }

    @Override
    public Iterable<Foodstuff> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        foodRepository.deleteById(id);
    }
}
