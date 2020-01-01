package com.example.demo.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.LoginService;

import com.example.demo.model.Login;

import com.example.demo.model.User;


@Controller
@SessionAttributes({"userName","userId"})
public class LoginController {

	@Autowired
   private LoginService loginService;
	@Autowired
	private Environment environment;

/*	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLoginDetails() {
		return new ModelAndView("login", "command", new Login());
	}

	@RequestMapping(value = "/authenticateLogin", method = RequestMethod.POST)
	public ModelAndView authenticateLogin( @ModelAttribute("command") Login userLogin, BindingResult result,
			ModelMap model) {		

		ModelAndView modelAndView = new ModelAndView("error");
		try {
			if (result.hasErrors()) {
				modelAndView= new ModelAndView("login", "command", userLogin);
			}
			else{
				User user= loginService.authenticateLogin(userLogin);
				
				model.addAttribute("userName", user.getName());
				model.addAttribute("userId", user.getUserId());
                //Select source values from db
               // List<String> s1=flightService.getSources();
                
               // model.addAttribute("sourceList", s1);
                
                //Select destination values from db
               // List<String> s2=flightService.getDestinations();
               
               // model.addAttribute("destinationList", s2);

			// modelAndView = new ModelAndView("searchFlights", "command", new SearchFlights());	
			}
		}
		catch (Exception e) {
			
			if (e.getMessage().contains("LoginService")) {
				modelAndView = new ModelAndView("login"); 
				modelAndView.addObject("loginName", userLogin.getUserId());
			}

			modelAndView.addObject("message", environment.getProperty(e.getMessage()));
		}
		return modelAndView;

	} */


}

