package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{
    private List<Car> cars;

    public CarDAOImpl() {
        cars = new ArrayList<>();
        cars.add(new Car (1, "BMV", 35));
        cars.add(new Car (2, "Mers", 63));
        cars.add(new Car (3, "Toyota", 48));
        cars.add(new Car (4, "Lada", 79));
        cars.add(new Car (5, "Nissan", 12));
    }

    @Override
    public List<Car> showAll () {
        return cars;
    }

    public int getCarCount() {
        return cars.size();
    }
}
