package com.project.questionapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questionapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long >{

}
