package com.tutorial.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

 
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.springboot.bean.Soumya_Tutorial;
import com.tutorial.springboot.service.TutorialService;

@RestController
public class Tutorialcontroller {

	@Autowired
	private TutorialService ts;

	// Create New Tutorial
	@PostMapping("/tutorialsr") //handle http request
	public Soumya_Tutorial addTutorial(@RequestBody Soumya_Tutorial tut) {
		return this.ts.addTutorial(tut);
	}


	@GetMapping("/tutorialsr") //same
	public List<Soumya_Tutorial> getTutorials() {
		return this.ts.getTutorial();
	}


	@GetMapping("/tutorialsr/{tutorialId}")
	public Soumya_Tutorial getTutorial(@PathVariable String tutorialId) {
		return this.ts.getTutorial(Long.parseLong(tutorialId));
	}

	@PutMapping("/tutorialsr") //update&modify
	public Soumya_Tutorial updateTutorial(@RequestBody Soumya_Tutorial tut) {
		return this.ts.updateTutorial(tut);
	}

	@DeleteMapping("/tutorialsr/{tutorialId}") //delete purpose
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable String tutorialId) {
		try {
	
			this.ts.deleteTutorial(Long.parseLong(tutorialId));
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
