package com.SpringTest.UserPrivilegesService.repository;

import com.SpringTest.UserPrivilegesService.entity.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
		
	@Query("select distinct p from User u join u.roles r join r.privileges p "+
			"where u.id = :userId")
	List<Privilege> getUserPrivileges(@Param("userId") Long userId);

}
