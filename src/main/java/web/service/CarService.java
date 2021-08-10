package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Tayota", "Supra", 1980));
        carList.add(new Car("BMW", "x3", 2010));
        carList.add(new Car("Nisssan", "Skyline", 1994));
        carList.add(new Car("Lambo", "Reventon", 2007));
        carList.add(new Car("Honda", "Civic", 2004));
    }

    public List<Car> getCarList(Integer count) {
        if (count == null || count < 1 || count > 4) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
