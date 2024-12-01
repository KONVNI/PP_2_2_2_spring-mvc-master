package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Toyota", "Corolla", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("Chevrolet", "Camaro", 2018));
        cars.add(new Car("Nissan", "Altima", 2022));
    }

    public List<Car> getCars(Integer count) {
        if (count != null && count > 0 && count < cars.size()) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
