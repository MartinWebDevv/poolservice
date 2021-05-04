package com.martin.projectweek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.martin.projectweek.models.Schedule;
import com.martin.projectweek.repository.ScheduleRepo;

@Service
public class ScheduleService {
	private final ScheduleRepo scheduleRepo;
	
	public ScheduleService(ScheduleRepo scheduleRepo) {
		this.scheduleRepo = scheduleRepo;
	}
	
	public Schedule addSchedule(Schedule schedule) {
		return scheduleRepo.save(schedule);
	}
	
	public Schedule findSchedule(Long id) {
		Optional<Schedule> optionalSched = scheduleRepo.findById(id);
		if(optionalSched.isPresent()) {
			return optionalSched.get();
		}else {
			return null;
		}
	}
	
	public void deleteSchedule(Long id) {
		scheduleRepo.deleteById(id);
	}
	
	public Schedule updateSchedule(Long id, Schedule schedule) {
		Schedule sched = findSchedule(id);
		sched.setFirstName(schedule.getFirstName());
		sched.setLastName(schedule.getLastName());
		sched.setEmail(schedule.getEmail());
		sched.setReason(schedule.getReason());
		sched.setDesc(schedule.getDesc());
		return scheduleRepo.save(sched);
	}
	
	public Optional<Schedule> getSchedule(Long id){
		return scheduleRepo.findById(id);
	}
	
	public List<Schedule> allSchedule(){
		return scheduleRepo.findAll();
	}
}
