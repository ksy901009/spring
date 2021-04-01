package com.test.spring01;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test04")
public class Test04Controller {
	public Test04Controller() {
		
	}
	
	@RequestMapping("/test04.do")
	public String test04() {
		return "test04/exam01";
	}
	
	@RequestMapping("/test04Proc.do")
	public String test04Proc(@ModelAttribute Test04DTO dto, Model model) {
		model.addAttribute("dto", dto);
		
		return "test04/exam01Result";
	}
}