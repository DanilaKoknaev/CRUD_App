package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.models.Car;

import java.util.List;

@Component
public class ServiceImpl implements Service {
    private final CarDAO carDAO;

    @Autowired
    public ServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> showAll () {
       return carDAO.showAll();
    }

}
