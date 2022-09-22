package web.service;

import web.model.Car;

import java.util.List;

public class CarService {
    public List<Car> getCars (List<Car> carList, int countOfCar) {
        return carList.stream().limit(countOfCar).toList();
    }
}
