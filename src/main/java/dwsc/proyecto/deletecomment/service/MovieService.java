package dwsc.proyecto.deletecomment.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import dwsc.proyecto.deletecomment.domain.Movie;

@Service
public interface MovieService {
	public Optional<Movie> findMovieById(String movieId);

	public double getScoreAverageByMovie(String movieId);

	public void updateScore(String id, double score);
}
