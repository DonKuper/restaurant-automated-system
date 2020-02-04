package ru.kuper.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kuper.restaurant.service.FoodService;

@Controller
@RequestMapping("/")
public class HomeController {

    private FoodService foodService;

    @Autowired
    public HomeController (FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("foodstuffs", foodService.findAll());
        return "index";
    }



}
