package com.gfttraining.hello;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/hello")
	public String helloWorld() {
		return "we are in business";
	}
	
	@GetMapping("/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return "Hello "+ name;
	}
	@GetMapping("/greetingFull/{name}/{lastName}")
	public String greetingFull(@PathVariable String name, @PathVariable String lastName) {
		return "Hello " + name + lastName;
	}
	
	@GetMapping("/greeting2/{nombre}")
	public String greeting2(@PathVariable("nombre") String name) {
		return "Hello " + name;
	}
	@GetMapping("/helloBean")
	public HelloBean helloWorldBean() {
		return new HelloBean("Afayaivos!!");
	}
	@GetMapping("/helloBeanRE")
	public ResponseEntity<HelloBean> helloWorldBeanRE(){
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Language", "ast");
		return new ResponseEntity<> (new HelloBean("Afayaivos!!"), headers, HttpStatus.OK);
	}
	
}
