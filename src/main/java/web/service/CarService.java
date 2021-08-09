package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Jiga", 93));
        cars.add(new Car(2, "Bugatti Veyron", 1200));
        cars.add(new Car(3, "Tayota Supra", 1500));
        cars.add(new Car(4, "Tayota AE86", 153));
        cars.add(new Car(5, "Nissan Skyline r34", 600));
        return cars;
    }
}

