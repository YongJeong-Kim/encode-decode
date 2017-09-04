package com.example.controller;


import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.component.EncodeDecode;
import com.example.service.PersonService;

@Controller
public class HomeController {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private EncodeDecode encodeDecode;
	
	@PostConstruct
	public void dd() throws IOException {
		personService.init();
	}
	
	@GetMapping("/")
	public ModelAndView ff(ModelAndView mav) {
		String imagePath = "C:\\Users\\yjk\\Desktop\\streamAPI.png";
		String base64Image = encodeDecode.encodeImage(imagePath);
		
		// decode : encode String, output path
		encodeDecode.decodeImage(base64Image, "C:\\Users\\yjk\\Desktop\\aabbcc.png");
		
		mav.addObject("base64Image", base64Image);
		mav.setViewName("index");
		
		encodeDecode.encodeString();
		
		return mav;
	}
}
