package com.example.oshit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class OshitApplication {

	@GetMapping("/")
	public String getName(){
		return "Hijoeputa!";
	}

	@GetMapping("/cabron")
	public String getError(){
		return "Hijoeputa ERROR!";
	}

	public static void main(String[] args) {
		SpringApplication.run(OshitApplication.class, args);
	}

}
