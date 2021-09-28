package com.examples.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.entities.Role;
import com.examples.entities.Roles;

public interface RoleRepository extends JpaRepository<Role,Integer>{
	Optional<Role> findByRoleName(Roles role);
}
