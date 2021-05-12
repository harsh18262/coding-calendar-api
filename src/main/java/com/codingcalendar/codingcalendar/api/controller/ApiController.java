package com.codingcalendar.codingcalendar.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
		@GetMapping("/test")
		public String test()
		{
			return "test";
		}

		@GetMapping("/all")
		public ResponseEntity<Iterable<Contest>> getall()
		{
			return  ResponseEntity.ok(apiservices.getAllcontests());
		}
		
		@GetMapping("/error1")
		public ResponseEntity error()
		{
			return  ResponseEntity.ok(contestrepo.findAll());
		}

}
