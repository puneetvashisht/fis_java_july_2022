package com.fis.springbootadv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.springbootadv.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
