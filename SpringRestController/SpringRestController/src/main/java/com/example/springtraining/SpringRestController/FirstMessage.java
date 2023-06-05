package com.example.springtraining.SpringRestController;

import org.springframework.stereotype.Component;

//import org.springframework.web.bind.annotation.RestController;

@Component

public class FirstMessage implements Message {
public String Greet(){
	return "Hello World!";
}

}
