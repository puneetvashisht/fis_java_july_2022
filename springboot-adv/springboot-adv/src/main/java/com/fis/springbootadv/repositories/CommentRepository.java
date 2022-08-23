package com.fis.springbootadv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.springbootadv.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
