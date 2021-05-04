package com.martin.projectweek.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.martin.projectweek.models.Schedule;
import com.martin.projectweek.service.ScheduleService;
import com.martin.projectweek.service.UserService;

@Controller
public class ScheduleController {
	private final ScheduleService scheduleService;
	private final UserService userService;
	
	public ScheduleController(ScheduleService scheduleService, UserService userService) {
		this.scheduleService = scheduleService;
		this.userService = userService;
	}
	
	@RequestMapping("/scheduling")
	public String schedule(@ModelAttribute("schedule")Schedule schedule, Model model) {

		return "schedule.jsp";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contanct.jsp";
	}
}
