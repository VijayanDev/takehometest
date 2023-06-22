package com.SpringTest.UserPrivilegesService.repository;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.SpringTest.UserPrivilegesService.entity.User;

@SpringBootTest
class UserRepositoryTest {
	
	@Autowired
    private UserRepository usrRepo;

	@Test
	void testGetUserRoles() {
		Optional<User> usr = (Optional<User>)usrRepo.findById(10005L);
		assertTrue(usr.isPresent(),"No User found");
		assertTrue(usr.get().getRoles().size()>0, "No Roles found");
	}
	

}
