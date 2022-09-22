package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> carList();
    List<Car> getCars(List<Car> carList, int countOfCar);
}
