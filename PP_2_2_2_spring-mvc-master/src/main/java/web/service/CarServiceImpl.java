package web.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> showAll () {
       return carDAO.showAll();
    }

}
