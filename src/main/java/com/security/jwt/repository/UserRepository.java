package com.security.jwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.security.jwt.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	  Optional<User> findByUsername(String username);

	  Boolean existsByUsername(String username);

	  Boolean existsByEmail(String email);
}