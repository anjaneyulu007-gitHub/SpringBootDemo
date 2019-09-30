package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "<h1>Welcome to Home PAGE.</h1>";
	}

	@RequestMapping("/user")
	public String user() {
		return "<h1>Welcome to User PAGE.</h1>";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "<h1>Welcome to Admin PAGE.</h1>";
	}

}
