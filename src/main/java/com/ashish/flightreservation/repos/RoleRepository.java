package com.ashish.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
