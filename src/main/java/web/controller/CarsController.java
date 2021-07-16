package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIml;

@Controller
public class CarsController {

    private CarServiceIml carServiceIml;

    public CarsController(CarServiceIml carServiceIml) {
        this.carServiceIml = carServiceIml;
    }

    @GetMapping("/cars")
    public String getAllCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
            model.addAttribute("cars", carServiceIml.show(count));
        return "cars";
    }

}
