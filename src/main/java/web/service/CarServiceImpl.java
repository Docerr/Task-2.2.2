package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }

    @Override
    public List<Car> getCars(List<Car> carList, int countOfCar) {
        if(countOfCar == 0 || countOfCar >= 5) {
            return carList;
        }
        return carList.stream().limit(countOfCar).collect(Collectors.toList());
    }
}
