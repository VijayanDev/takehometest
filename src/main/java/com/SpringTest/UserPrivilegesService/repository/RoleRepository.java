package com.SpringTest.UserPrivilegesService.repository;

import com.SpringTest.UserPrivilegesService.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
