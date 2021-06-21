package com.example.Human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human {
	@RequestMapping("/")
	public String var(@RequestParam(value="name",required=false) String str) {
		if(str != null) {
		return "<h1>Hello "+str+"</h1>";
}
		else {
			return "<h1>Hello Human</h1><br><p>Spring Boot</p>";
		}
}
}