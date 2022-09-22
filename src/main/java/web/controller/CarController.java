package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (defaultValue = "5", value = "count", required = false) int count, ModelMap model) {

        List<Car> cars = new ArrayList<>();

        cars.add(0, new Car("BMW", 200, 2));
        cars.add(1, new Car("Lada", 100000000, 20));
        cars.add(2, new Car("Tesla", 2, 1));
        cars.add(3, new Car("Mercedes", 30, 23));
        cars.add(4, new Car("RenaultRamilya", 200000000, 11));

        cars = new CarService().getCars(cars, count);

        model.addAttribute("cars", cars);
        return "cars";
    }

}
