package com.fis.springbootjaxrsadv.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.springbootjaxrsadv.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
