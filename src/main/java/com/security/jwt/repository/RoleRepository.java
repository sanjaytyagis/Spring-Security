package com.security.jwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.security.jwt.models.ERole;
import com.security.jwt.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	Optional<Role> findByName(ERole name);
}
