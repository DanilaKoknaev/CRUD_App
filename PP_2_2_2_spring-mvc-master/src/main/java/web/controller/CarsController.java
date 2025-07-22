package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.plaf.synth.ColorType.MAX_COUNT;

@Controller
public class CarsController {

    private final CarDAO carDAO;

    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping(value = "/cars")
    public String show (@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        List<Car> allCars = carDAO.showAll();
        if (count != null && count > 0 && count < allCars.size()) {
            model.addAttribute("cars", allCars.subList(0, Math.min(count, allCars.size())));
        } else {
            model.addAttribute("cars", allCars); // Весь список при count ≥ 5 или отсутствии параметра
        }

        return "cars";
    }




}
