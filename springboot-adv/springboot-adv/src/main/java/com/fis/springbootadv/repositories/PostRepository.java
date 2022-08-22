package com.fis.springbootadv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.springbootadv.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
