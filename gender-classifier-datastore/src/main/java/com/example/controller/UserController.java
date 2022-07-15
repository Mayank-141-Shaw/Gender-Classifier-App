package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	/** 
	 * The function would parse id from the query request and
	 * return the user of the requested id
	 * If it does not exist then a null object shall be returned
	 * 
	 * @param	id		Long
	 * @return	User	User object or null
	 * @see 			getUserData
	 */
	
	@GetMapping("/id/{id}")
	public User getUserData(@PathVariable long id) {
		return userService.getUserById(id);
	}
}
