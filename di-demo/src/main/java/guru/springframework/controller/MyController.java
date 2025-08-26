package guru.springframework.controller;

import guru.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller // Marca esto como un Spring Bean
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String hello() {
		System.out.println("Hello World");

		return greetingService.sayGreeting();
	}
}
