package com.rakuten.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.model.Workout;
import com.rakuten.repository.WorkoutRepository;

@Service
public class WorkoutService {

	@Autowired
	WorkoutRepository repository;

	public void saveWorkout(Workout workout) {
		repository.save(workout);
	}

	public List<Workout> getAllWorkouts() {
		return repository.findAll();
	}

	public Workout getWorkoutById(int workid) {
		Optional<Workout> optional = repository.findById(workid);
		if (optional.isEmpty()) {
			throw new IllegalArgumentException();
		}
		return optional.get();
	}

	public void updateWorkoutById(Workout workout) {
		if (!repository.existsById(workout.getId())) {
			throw new IllegalArgumentException();
		}
		repository.save(workout);
		System.out.println("Updated values!!!");
	}

	public void deleteWorkoutById(int workid) {
		repository.deleteById(workid);
	}

}