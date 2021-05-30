package com.codingcalendar.codingcalendar.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingcalendar.codingcalendar.api.Entities.Contest;
import com.codingcalendar.codingcalendar.api.Entities.ContestRepository;
import com.codingcalendar.codingcalendar.api.Services.ApiServices;

@RestController
@CrossOrigin(origins = "*")
public class ApiController {
		
		
		@Autowired
		ApiServices apiservices;
		@Autowired
		ContestRepository contestrepo;


		@GetMapping("/all")
		public ResponseEntity<Iterable<Contest>> getall()
		{
			return  ResponseEntity.ok(apiservices.getAllcontests());
		}
		
		@GetMapping("/contests")
		public Iterable<Contest> getby_platform_and_phase(@RequestParam(name="platform",required = false) String Platform,@RequestParam(name="phase",required = false) String Phase) 
		{
			
			return apiservices.getby_platform_and_phase(Platform, Phase);
			
		}
		@GetMapping("/error")
		public BodyBuilder error()
		{
			return  ResponseEntity.badRequest();
		}

}
