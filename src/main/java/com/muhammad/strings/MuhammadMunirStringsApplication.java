package com.muhammad.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MuhammadMunirStringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuhammadMunirStringsApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "hello client! how are you doing?";
	}

	@RequestMapping("/random")
	public String random(){
		return "Spring boot is great! So easy to respond with strings";
	}
}
