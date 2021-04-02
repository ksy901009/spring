package com.test.spring01.test;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test03")
public class Test03Controller {
	public Test03Controller() {
		
	}
	
	@RequestMapping("/test03.do")
	public String test03() {
		return "test03/exam01";
	}
	
//	@RequestMapping("/test03Proc.do")
//	public String test03Proc(Model model,
//			@RequestParam(value="name", defaultValue="") String name,
//			@RequestParam(value="gender", defaultValue="F") String gender,
//			@RequestParam(value="jumin", defaultValue="XXXX") String jumin,
//			@RequestParam(value="age", defaultValue="0") int age
//			) {
//		model.addAttribute("name", name);
//		model.addAttribute("gender", gender);
//		model.addAttribute("jumin", jumin);
//		model.addAttribute("age", age);
//		
//		return "test03/exam01Result";
//	}
	
	public Map<String, String> test(HttpServletRequest request) {
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String jumin = request.getParameter("jumin");
		String age = request.getParameter("age");
		
		Map<String, String> map = new HashMap<>();
		map.put("name", name);
		map.put("gender", gender);
		map.put("jumin", jumin);
		map.put("age", age);
		
		return map;
	}
	
	@RequestMapping("/test03Proc.do")
	public String test03Proc(HttpServletRequest request, Model model) {
		Map<String, String> map = test(request);
		model.addAttribute("map", map);
		
		return "test03/exam01Result";
	}
}