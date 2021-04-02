package com.test.spring01.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test08")
public class Test08Controller {
	public Test08Controller() {
		
	}
	
	@RequestMapping("/test08.do")
	public String test08() {
		return "test08/exam01";
	}
	
	@RequestMapping("/test08Proc.do")
	public String test08Proc(@ModelAttribute Test08DTO dto, Model model) {
		model.addAttribute("dto", dto);
		
		return "test08/exam01Result";
	}
}