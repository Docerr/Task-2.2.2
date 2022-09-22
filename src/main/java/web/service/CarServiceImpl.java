package web.service;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Override
    public List<Car> carList() {
        return carDao.carList();
    }

    @Override
    public List<Car> getCars(List<Car> carList, int countOfCar) {
        return carDao.getCars(carList, countOfCar);
    }
}
