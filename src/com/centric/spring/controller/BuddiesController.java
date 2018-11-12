package com.centric.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centric.spring.repository.User;
import com.centric.spring.service.UserService;

@RestController
@RequestMapping("api")

public class BuddiesController {

	@Autowired
	private UserService userService;
	@RequestMapping("/buddies")
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(userService.findAll());
		
	}
	
}
