package com.example.SpringWebapp.demoWebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class demoController {
	
	
	@GetMapping("/getread")
	public String getReadData() {
		return "Hello";
	}
	
	
	@PostMapping("/postData")
	public String savedata(@RequestBody Customer customer) {
		System.out.print(customer.id);
		System.out.print(customer.name);
		System.out.print(customer.accountno);
	return "data stored";	
	} 

}
