package io.amitabh.moviedemoserviceinfo.resourse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.amitabh.moviedemoserviceinfo.modal.Movie;

@RestController
@RequestMapping("/movie")
public class MovieService {
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId")String movieId) {
		System.out.print(movieId);
		return new Movie(movieId, "Ami", "1234");
	}

}
