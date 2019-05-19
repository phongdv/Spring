package Services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fpt.edu.entities.UserEntity;
@Repository
public interface abc extends CrudRepository<UserEntity, String>{

}
