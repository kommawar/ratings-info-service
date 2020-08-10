package io.javawork.ratingsinfoservice.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.javawork.ratingsinfoservice.model.Rating;

@RestController
public class RatingsIinfoServiceController {

	@GetMapping("ratings")
	public List<Rating> getHospitals(){
		List<Rating> ratings = new ArrayList<Rating>();
		
		Rating mayo = new Rating(1, 1, 1, 5);
		Rating optum = new Rating(2, 1, 2, 4);
		
		ratings.add(mayo);
		ratings.add(optum);
		
		return ratings;
	}
	
}
