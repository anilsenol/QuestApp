package com.project.questionapp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questionapp.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

	List<Post> findByUserId(Long userId);

}
