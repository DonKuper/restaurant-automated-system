package ru.kuper.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.kuper.restaurant.service.FoodService;

@Controller
@RequestMapping("/")
public class HomeController {

    private FoodService foodService;
//    private GeneralListOfFoodstuffController generalListOfFoodstuffController;

    @Autowired
    public HomeController (FoodService foodService) {
        this.foodService = foodService;
//        this.generalListOfFoodstuffController = generalListOfFoodstuffController;
    }

    @GetMapping
    public ModelAndView getIndex() {
        return new ModelAndView("redirect:/generallist");
    }

}
