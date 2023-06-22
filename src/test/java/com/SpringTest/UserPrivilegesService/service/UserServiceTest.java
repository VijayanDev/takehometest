package com.SpringTest.UserPrivilegesService.service;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {
	
	@Autowired
    private UserService usrSvc;

	@Test
	void testGetUserPrivileges() {
		Long userId = 100011L;
		assertTrue(usrSvc.findUserById(userId).isPresent(),"No User found");
		assertTrue(usrSvc.getUserPrivileges(userId).size()>0, "No privileges found");
	}
	

}
