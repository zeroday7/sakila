package com.example.sakila.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActorController {
	@GetMapping("/on/addActor")
	public String addActor() {
		return "on/addActor";
	}
}
