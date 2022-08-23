package co.grandcircus.practiceassessment8;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://gc-express-tester.surge.sh/")
@RestController



public class AnimalController {
	
	@Autowired
	private AnimalRepository aRepo;
	
	@GetMapping("/animals")
	public List<AnimalModel> showAnimals() {
		return aRepo.findAll();
		
	}
	
	@GetMapping("/animals1")
	public String showAnimals1() {
		return "Hello World";
		
	}
	
	@GetMapping("/animals/{id}")
	public String findById(@PathVariable("id") String id) {
		//return aRepo.findById(id).orElseThrow(() -> new ItemNotFoundException("Pet Not Found"));
		return null;
	}
	
	@PostMapping("/animals")
	public AnimalModel CreateOne(@RequestBody AnimalModel name) {
		aRepo.insert(name);
		return name;
	}
	
	@PutMapping("/animals/{id}")
	public AnimalModel updateOne(@RequestBody AnimalModel name, @PathVariable("id") String id) {
		//name.setId(id);
		aRepo.save(name);
		return name;
	}
	
	@DeleteMapping("/animals/{id}")
	public void deleteOne(@PathVariable("id") String id) {
		aRepo.deleteById(id);
	}

}
