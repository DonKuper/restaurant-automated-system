package ru.kuper.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kuper.restaurant.model.Foodstuff;
import ru.kuper.restaurant.model.enums.DeliverState;
import ru.kuper.restaurant.model.enums.OnKitchenState;
import ru.kuper.restaurant.model.enums.Units;
import ru.kuper.restaurant.service.FoodService;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class HomeController {

    private FoodService foodService;

    @Autowired
    public HomeController (FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public String getGeneralList(Model model) {
        model.addAttribute("foodstuffs", foodService.findAll());
        model.addAttribute("newFoodstuff", new Foodstuff());
        return "index";
    }

    @PostMapping(params = "action=save")
    public String saveFoodstuff(Foodstuff foodstuff) {
        foodstuff.setQuantity_for_deliver(1.0);
        foodstuff.setDeliver_state(DeliverState.DOESNT_NEED_TO_BE_PURCHASED);
        foodstuff.setOn_kitchen_state(OnKitchenState.INNESSCESSARY);
        foodstuff.setUnit(Units.KG);
        foodService.save(foodstuff);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteFoodstuffById(@PathVariable("id") Long id) {
        foodService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editFoodstuffFormById(@PathVariable("id") Long id, Model model) {
        Optional foodstuffObject = foodService.findById(id);
        if (foodstuffObject.isPresent()) {
            model.addAttribute(foodstuffObject.get());
        }
        return "editFoodstuff";
    }

    @PostMapping("/{id}")
    public String editFoodstuffById(@PathVariable("id") Long id, Foodstuff foodstuff) {
        foodstuff.setUnit(Units.KG);
        foodstuff.setDeliver_state(DeliverState.DOESNT_NEED_TO_BE_PURCHASED);
        foodstuff.setOn_kitchen_state(OnKitchenState.INNESSCESSARY);
        foodstuff.setQuantity_for_deliver(1.0);
        foodService.save(foodstuff);
        return "redirect:/";
    }


}
