package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/getH")
	public String getHello() {
		 String url = "http://name:8081/name/getN";
		RestTemplate rest = new RestTemplate();
		String name = rest.getForObject(url,String.class);
		
		return "Hello " + name ;
	}
}
