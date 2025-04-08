package guru.springframework.controller;

import org.springframework.stereotype.Controller;

@Controller // Marca esto como un Spring Bean
public class MyController {
	
	public String hello() {
		System.out.println("Hello World");
		
		return "foo";
	}
}
