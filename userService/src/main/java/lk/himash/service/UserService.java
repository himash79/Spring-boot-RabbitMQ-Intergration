package lk.himash.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lk.himash.entity.User;
import lk.himash.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserService {
	
	private final UserRepository userRepo;
	
	public ResponseEntity<?> getAllUsers() {
		List<User> users = userRepo.findAll();
		log.info("Fetched all users : " + users);
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	public ResponseEntity<?> addUser(User user) {
		User addedUser = userRepo.save(user);
		log.info("added user : " + addedUser);
		return new ResponseEntity<>(addedUser,HttpStatus.CREATED);
	}

}
