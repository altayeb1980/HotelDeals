package com.epam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.epam.model.SearchCriteria;
import com.epam.service.HotelService;


@Controller
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/search")
	public String search(@ModelAttribute SearchCriteria searchCriteria) {
		return "search";
	}
	
}
