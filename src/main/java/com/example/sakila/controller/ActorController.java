package com.example.sakila.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sakila.vo.ActorForm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ActorController {
	@GetMapping("/on/actorList")
	public String actorList(@RequestParam(defaultValue = "1") int currentPage
							, @RequestParam(defaultValue = "10") int rowPerPage) {
		return "on/actorList";
	}
	
	@PostMapping("/on/addActor")
	public String addActor(ActorForm actorForm) { // input type="file"
		log.debug(actorForm.getFirstName());
		log.debug(actorForm.getLastName());
		log.debug("actorFile : "+actorForm.getActorFile());
		if(actorForm.getActorFile() != null) {
			log.debug("actorFile size : "+actorForm.getActorFile().size());
		}
		
		
		return "redirect:/on/actorList";
	}	
	
	@GetMapping("/on/addActor")
	public String addActor() {
		return "on/addActor";
	}
	

}
