package springbootproject.cars.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootproject.cars.domain.Car;
import springbootproject.cars.domain.CarService;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    private CarService service = new CarService();

    @GetMapping()
    public List<Car> get() {
        return service.getCars();
    }
}
