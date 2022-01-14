package com.combustivel.cbuser.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.combustivel.cbuser.entities.UserEntity;
import com.combustivel.cbuser.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public ResponseEntity<List<UserEntity>> findAll(){
		List<UserEntity> list = userRepository.findAll(); 
		
		return ResponseEntity.ok(list);
		
	}
	
}
