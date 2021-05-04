package com.martin.projectweek.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.martin.projectweek.models.Schedule;

@Repository
public interface ScheduleRepo extends CrudRepository <Schedule, Long> {
	
	List<Schedule> findAll();

}
