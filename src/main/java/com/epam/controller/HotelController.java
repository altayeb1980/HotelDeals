package com.epam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.epam.model.SearchCriteria;
import com.epam.service.HotelService;


@RestController
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	@GetMapping("/")
	public ModelAndView index(@ModelAttribute("searchCriteria") SearchCriteria searchCriteria) {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject(hotelService.findAll());
		return modelAndView;
	}
	
	
	@PostMapping("/search")
	public ModelAndView search(@ModelAttribute SearchCriteria searchCriteria) {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject(hotelService.findByCriteria(searchCriteria));
		return modelAndView;
	}
	
}
