package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceIml implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", 1));
        carList.add(new Car("BMV", 2));
        carList.add(new Car("Lada", 3));
        carList.add(new Car("Gazel", 4));
        carList.add(new Car("Kio", 5));
    }

    @Override
    public List<Car> show(Integer id) {
        Integer count = id == null ? 5 : id;
        return carList.stream().filter(carlist -> carlist.getId() <= count).collect(Collectors.toList());
    }
}
