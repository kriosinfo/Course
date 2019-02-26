package com.topic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	
	@GetMapping("/")
	public String Home() {
		return "success";
	}
	
	
	@GetMapping("/")
	public String Home() {
		return "login";
	}
	
}
