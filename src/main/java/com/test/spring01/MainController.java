package com.test.spring01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	public MainController() {
		
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", "안녕하세요?");
		
		return "index";
	}
}