package com.fis.springbootadv.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.springbootadv.entities.Comment;
import com.fis.springbootadv.entities.Post;
import com.fis.springbootadv.repositories.PostRepository;



@RestController
@RequestMapping("/posts")
public class PostRestController {
	@Autowired
	PostRepository postRepository;
	
	@PostMapping("/")
	public ResponseEntity<Void> addPost(@RequestBody Post post) {

		postRepository.save(post);
		return new ResponseEntity<>(HttpStatus.CREATED);
//		return Response.status(Status.CREATED).build();
	}

	@GetMapping("/")
	public ResponseEntity<List<Post>> fetchAllPosts() {
		List<Post> posts = postRepository.findAll();
		return new ResponseEntity<>(posts, HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}/comments")
	public ResponseEntity<List<Comment>> fetchAllCommentsForAPost(@PathVariable("id") int id) {
		Optional<Post> postFound = postRepository.findById(id);
		if(postFound.isPresent()) {
			Post post =  postFound.get();
			List<Comment> comments = post.getComments();
			System.out.println(comments);	
			return new ResponseEntity<>(comments, HttpStatus.OK); //Response.ok(comments).build();
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
//	
//	@Path("{id}/comments")
	@PostMapping("/{id}/comments")
	public ResponseEntity<List<Comment>> addCommentForAPost(@PathVariable("id") int id, @RequestBody Comment comment) {
		Optional<Post> postFound = postRepository.findById(id);
		if(postFound.isPresent()) {
			Post post =  postFound.get();
			List<Comment> comments = post.getComments();
			comments.add(comment);
			System.out.println(comments);	
			postRepository.save(post);
			 return new ResponseEntity<>(comments, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Post> fetchPostById(@PathVariable("id") int id) {
		Optional<Post> postFound = postRepository.findById(id);
		if(postFound.isPresent()) {
			Post post =  postFound.get();
			List<Comment> comments = post.getComments();
			System.out.println(comments);
			
			return new ResponseEntity<Post>(post, HttpStatus.OK);
		}
//		return Response.status(Status.NOT_FOUND).build();
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
