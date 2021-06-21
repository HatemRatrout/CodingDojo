package com.example.Routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dojo {
	@RequestMapping("/{variable}")
	public String dojo(@PathVariable("variable") String str) {
		if(str.equals("dojo")) {
			return "The dojo is awesome!";
		}else if(str.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}else if(str.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return "Error";
	}
}
