package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private static final List<Car> carList = List.of (

        new Car("BMW", 200, 2),
        new Car("Lada", 100000000, 20),
        new Car("Tesla", 2, 1),
        new Car("Mercedes", 30, 23),
        new Car("RenaultRamilya", 2000000001, 11),
        new Car("RenaultRamilya2", 2000000002, 11),
        new Car("RenaultRamilya3", 2000000003, 11),
        new Car("RenaultRamilya4", 2000000004, 11),
        new Car("RenaultRamilya5", 2000000005, 11),
        new Car("RenaultRamilya6", 2000000006, 11)

    );

    @Override
    public List<Car> getCars(int countOfCar) {
        if(countOfCar == 0 || countOfCar >= 5) {
            return carList;
        }
        return carList.stream().limit(countOfCar).collect(Collectors.toList());
    }
}
