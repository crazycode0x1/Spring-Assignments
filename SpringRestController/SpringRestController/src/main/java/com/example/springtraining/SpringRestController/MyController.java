package com.example.springtraining.SpringRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private Message msg;
	
	
	@Autowired
	public MyController(Message msg) {
		super();
		this.msg=msg;
	}
	
	@GetMapping ("/gr")
	
	public String getGreeting() {
		return msg.Greet(); 
	}
}
