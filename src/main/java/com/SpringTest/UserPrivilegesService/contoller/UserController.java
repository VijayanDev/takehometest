package com.SpringTest.UserPrivilegesService.contoller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringTest.UserPrivilegesService.Exception.UserNotFoundException;
import com.SpringTest.UserPrivilegesService.entity.Privilege;
import com.SpringTest.UserPrivilegesService.entity.Role;
import com.SpringTest.UserPrivilegesService.entity.User;
import com.SpringTest.UserPrivilegesService.service.UserService;

import jakarta.persistence.EntityManager;

@RestController
@RequestMapping("/users")
public class UserController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

    private final UserService userService;
    
    @Autowired
    EntityManager em;	
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}/privileges")
    public List<Privilege> getUserPrivileges(@PathVariable Long userId) {
    	if(!userService.findUserById(userId).isPresent()){
    		log.error("User is not found for the given id :"+userId);
    		throw new UserNotFoundException("User Id not found :: "+userId);
    	}
    	return  userService.getUserPrivileges(userId);
        
    }
    
    @GetMapping("/{userId}/roles")
    public List<Role> getUserRoles(@PathVariable Long userId) {
    	User user = em.find(User.class, userId);
    	if(user == null){
    		log.error("User is not found for the given id :"+userId);
    		throw new UserNotFoundException("User Id not found :: "+userId);
    	}
    	log.info("Roles for the given userId ["+userId+"] is {}"+ user.getRoles());
        return  user.getRoles();	

    }

}
