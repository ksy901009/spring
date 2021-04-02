package com.test.spring01.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test09")
public class Test09Controller {
	public Test09Controller() {
		
	}
	
	@RequestMapping("/test09.do")
	public String test09() {
		return "test09/exam01";
	}
	
	@RequestMapping("/test09Proc.do")
	public @ResponseBody Map<String, String> test09Proc(@ModelAttribute Test09DTO dto, Model model) {
		model.addAttribute("id", dto.getId());
		model.addAttribute("name", dto.getName());
		model.addAttribute("email", dto.getEmail());
		
		Map<String, String> map = new HashMap<>();
		map.put("id", dto.getId());
		map.put("name", dto.getName());
		map.put("email", dto.getEmail());
		
		return map;
	}
}