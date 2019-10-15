package secur.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import secur.demo.Model.mystudent;

public interface student extends CrudRepository<mystudent, Integer> {
}
