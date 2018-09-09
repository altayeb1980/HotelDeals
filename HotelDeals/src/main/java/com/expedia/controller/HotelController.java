package com.expedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.expedia.model.HotelDeal;
import com.expedia.model.SearchCriteria;
import com.expedia.service.HotelService;


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
	
	
	@PostMapping("/findHotels")
	@ResponseBody
	public ModelAndView findHotels(@ModelAttribute SearchCriteria searchCriteria) {
		ModelAndView model = new ModelAndView("hotels");
		HotelDeal hotelDeal = hotelService.findHotels(searchCriteria);
		model.addObject(hotelDeal);
		return model;
	}
}
