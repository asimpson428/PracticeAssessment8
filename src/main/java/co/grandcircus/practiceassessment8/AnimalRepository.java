package co.grandcircus.practiceassessment8;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnimalRepository extends MongoRepository<AnimalModel, String> {
	
	List<AnimalModel> findAll();
	Optional<AnimalModel> findById(String id);

}
