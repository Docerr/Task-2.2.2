package web.dao;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> carList() {

        List<Car> carList = new ArrayList<>();

        carList.add(0, new Car("BMW", 200, 2));
        carList.add(1, new Car("Lada", 100000000, 20));
        carList.add(2, new Car("Tesla", 2, 1));
        carList.add(3, new Car("Mercedes", 30, 23));
        carList.add(4, new Car("RenaultRamilya", 200000000, 11));

        return carList;
    }

    @Override
    public List<Car> getCars (List<Car> carList, int countOfCar) {
        return carList.stream().limit(countOfCar).collect(Collectors.toList());
    }
}
