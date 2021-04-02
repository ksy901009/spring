package com.test.spring01.test;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test05")
public class Test05Controller {
	public Test05Controller() {
		
	}
	
	@RequestMapping("/test05.do")
	public String test05() {
		return "test05/exam01";
	}
	
	@RequestMapping("/test05Proc.do")
	public String test04Proc(@ModelAttribute Test05DTO dto, Model model) {
		dto.sum();
		dto.avg();
		model.addAttribute("dto", dto);
		
		return "test05/exam01Result";
	}
}