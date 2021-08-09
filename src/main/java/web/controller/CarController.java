package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam (name = "locale", defaultValue = "ru") String locale, ModelMap model) {
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getAllCars());
        if(locale.equals("en")) {
            model.addAttribute("title", "CARS");
        } else if(locale.equals("ru")) {
            model.addAttribute("title", "МАШИНЫ");
        }
        return "car";
    }
}
