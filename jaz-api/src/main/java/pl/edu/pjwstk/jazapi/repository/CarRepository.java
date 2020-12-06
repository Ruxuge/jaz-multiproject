package pl.edu.pjwstk.jazapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import pl.edu.pjwstk.jazapi.model.Car;

@EnableJpaRepositories
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
