package com.martin.projectweek.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.martin.projectweek.models.User;
import com.martin.projectweek.service.UserService;
import com.martin.projectweek.validation.UserValidator;

@Controller
public class UsersController {

	private final UserService userService;
	private final UserValidator validator;
 
	 public UsersController(UserService userService, UserValidator validator) {
	     this.userService = userService;
	     this.validator = validator;
	 }
	 
	 @RequestMapping("/registration")
	 public String registerForm(@ModelAttribute("user") User user) {
	     return "loginreg.jsp";
	 }
		@RequestMapping("/login")
	 public String login() {
	     return "loginreg.jsp";
	 }
		
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult results, HttpSession session) {
		validator.validate(user, results);
		if(results.hasErrors()) {
			return "loginreg.jsp";
		}else {
			User newUser = userService.registerUser(user);
			session.setAttribute("user_id", newUser.getId());
			return "redirect:/home";
		}
	}
	 
	 
	 @RequestMapping(value="/login", method=RequestMethod.POST)
	 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes flash) {
	     // if the user is authenticated, save their user id in session
	     // else, add error messages and return the login page
		 if(userService.authenticateUser(email, password)) {
			 User thisUser = userService.findByEmail(email);
			 session.setAttribute("user_id", thisUser.getId());
			 return "redirect:/home";
		 }
		 flash.addFlashAttribute("error", "Failed to Login");
		 return "redirect:/registration";
	 }
	 
	 @RequestMapping("/home")
	 public String home() {
	     // get user from session, save them in the model and return the home page

		 return "homePage.jsp";
	 }
	 
	 @RequestMapping("/logout")
	 public String logout(HttpSession session) {
	     // invalidate session
	     // redirect to login page
		 session.invalidate();
		 return "redirect:/registration";
	 }
}
