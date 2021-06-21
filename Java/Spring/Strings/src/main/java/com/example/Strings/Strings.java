package com.example.Strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Strings {
	@RequestMapping("/")
	public String index() {
		return "Hello Client! How are you doing ?";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring boot is great!";
	}
}
