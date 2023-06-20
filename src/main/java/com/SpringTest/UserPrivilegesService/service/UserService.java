package com.SpringTest.UserPrivilegesService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringTest.UserPrivilegesService.entity.Privilege;
import com.SpringTest.UserPrivilegesService.entity.User;
import com.SpringTest.UserPrivilegesService.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public  Optional<User> findUserById(Long userId) {
        return userRepository.findById(userId);
    }
    
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<Privilege> getUserPrivileges(Long userId){
    	return userRepository.getUserPrivileges(userId);
    }
    

}
