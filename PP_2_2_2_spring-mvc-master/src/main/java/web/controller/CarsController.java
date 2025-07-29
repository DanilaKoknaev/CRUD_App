package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;


import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String show (@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        List<Car> allCars = carService.showAll();
        if (count != null && count > 0 && count < allCars.size()) {
            model.addAttribute("cars", allCars.subList(0, Math.min(count, allCars.size())));
        } else {
            model.addAttribute("cars", allCars); // Весь список при count ≥ 5 или отсутствии параметра
        }

        return "cars";
    }
}
