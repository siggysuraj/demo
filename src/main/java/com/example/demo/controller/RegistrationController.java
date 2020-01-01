package com.example.demo.controller;


import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.LoginService;
import com.example.demo.service.RegisterService;


import antlr.collections.List;


@Controller

public class RegistrationController {

	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private UserRepository repo;
	
	/*
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String registration(Model model) {
		model.addAttribute("userForm", new User());
		return "register";
	}

    @RequestMapping(value="/register", method = RequestMethod.POST)
	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
		registerService.registerUser(userForm);
		return "welcome";
	}
    
    @GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return repo.findAll();
	}
   
*/
	
private Environment environment;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(Model model) {
		return new ModelAndView("register", "userForm", new User());
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView addCustomer( @ModelAttribute("userForm") User user, BindingResult result,
			ModelMap model) {
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {

			modelAndView= new ModelAndView("register", "userForm", user);
		} 
		else{
		try{
			registerService.registerUser(user);
			//modelAndView = new ModelAndView("registrationSucess");
			modelAndView= new ModelAndView("register", "userForm", user);
			modelAndView.addObject("successMessage","SUCCESSFUL_REGISTRATION");
			
		}catch(Exception e){
		
			if (e.getMessage().contains("RegistrationService")) {
				modelAndView = new ModelAndView("register"); 
				modelAndView.addObject("userForm",user);
				modelAndView.addObject("message", environment.getProperty(e.getMessage()));
			}
		}
		}
		return modelAndView;
	}   
	
	
}

