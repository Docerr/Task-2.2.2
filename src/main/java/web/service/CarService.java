package web.service;
import web.model.Car;
import java.util.List;

public interface CarService {
    List<Car> carList();
    List<Car> getCars(List<Car> carList, int countOfCar);
}


