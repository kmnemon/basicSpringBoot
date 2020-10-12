package keliu.basicSpringBoot.repos;

import keliu.basicSpringBoot.entities.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
