package lk.himash.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.entity.User;
import lk.himash.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/userApi")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<?> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		return userService.addUser(user);
	}


}
