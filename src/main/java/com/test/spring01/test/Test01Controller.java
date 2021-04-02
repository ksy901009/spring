package com.test.spring01.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test01")
public class Test01Controller {
	public Test01Controller() {
		
	}
	
	@RequestMapping("/test01.do")
	public String test01() {
		return "test01/exam01";
	}
	
	@RequestMapping("/test01Proc.do")
	public String test01Proc(Model model,
			@RequestParam(value="name", defaultValue="") String name,
			@RequestParam(value="jumin", defaultValue="XXXX") String jumin,
			@RequestParam(value="gender", defaultValue="F") String gender
			) {
		model.addAttribute("name", name);
		model.addAttribute("jumin", jumin);
		model.addAttribute("gender", gender);
		
		return "test01/exam01Result";
	}
	
	@RequestMapping("/test02.do")
	public String test02() {
		return "test02/exam01";
	}
	
	@RequestMapping("/test02Proc.do")
	public String test02Proc(Model model,
			@RequestParam(value="name", defaultValue="") String name,
			@RequestParam(value="jumin", defaultValue="XXXX") String jumin,
			@RequestParam(value="gender", defaultValue="F") String gender
			) {
		model.addAttribute("name", name);
		model.addAttribute("jumin", jumin);
		model.addAttribute("gender", gender);
		
		return "test02/exam01Result";
	}
}