package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    public List<Car> listCars() {

        List<Car> carList = new ArrayList<>();

        carList.add(0, new Car("Lada", 20021, 23));
        carList.add(1, new Car("Subaru", 20022, 5));
        carList.add(2, new Car("Hyundai", 20023, 56));
        carList.add(3, new Car("RAM", 20024, 76));
        carList.add(4, new Car("BMW", 20015, 67));
        carList.add(5, new Car("BMW1", 20015, 67));
        carList.add(6, new Car("BMW2", 20015, 67));
        carList.add(7, new Car("BMW3", 20015, 67));
        carList.add(8, new Car("BMW4", 20015, 67));
        carList.add(9, new Car("BMW5", 20015, 67));

        return carList;
    }

}
