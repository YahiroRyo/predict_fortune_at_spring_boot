package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Fortune {
	@GetMapping("/fortune")
	public ModelAndView start(ModelAndView modelAndView) {
		GeneratedRandomCount generatedRandomCount = GeneratedRandomCount.from();
		
		modelAndView.setViewName("predictResult.html");
		modelAndView.addObject("generatedRandomCount", generatedRandomCount);
		return modelAndView;
	}
}
