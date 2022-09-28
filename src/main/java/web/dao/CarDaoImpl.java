package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private static final List<Car> carList = List.of(

        new Car("BMW", 200, 2),
        new Car("Lada", 100000000, 20),
        new Car("Tesla", 2, 1),
        new Car("Mercedes", 30, 23),
        new Car("RenaultRamilya", 200000000, 11)
    );


    @Override
    public List<Car> getCars(int countOfCar) {
        if(countOfCar == 0) {
            return carList;
        }
        return carList.stream().limit(countOfCar).collect(Collectors.toList());
    }
}
