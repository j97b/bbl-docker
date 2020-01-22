package com.bae.rest;

import com.bae.persistence.domain.User;
import com.bae.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userApp")
public class UserController {

	private UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@GetMapping("/user")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/user/{userId}")
	public User getUserByID(@PathVariable(value = "userId") Long userId) {
		return service.findUserById(userId);
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User newUser) {
		return service.addUser(newUser);
	}

	@DeleteMapping("/user/{userId}")
	public String deleteUser(@PathVariable(value = "userId") Long userId) {
		return service.deleteUser(userId);
	}

	@PutMapping("/user/{userId}")
	public User updateUser(@RequestBody User userToUpdate, @PathVariable(value = "userId") Long userId) {
		return service.updateUser(userToUpdate, userId);
	}

}
