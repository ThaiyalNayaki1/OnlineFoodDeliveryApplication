package com.examples.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	public UserEntity findByUserName(String userName);
	public boolean existsByUserName(String userName);
}