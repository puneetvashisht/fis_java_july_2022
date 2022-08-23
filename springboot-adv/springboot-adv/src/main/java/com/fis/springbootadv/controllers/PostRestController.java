package com.fis.springbootadv.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fis.springbootadv.entities.Comment;
import com.fis.springbootadv.entities.Post;
import com.fis.springbootadv.repositories.PostRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value = "Post Rest controller")
@RestController
@RequestMapping("/posts")
public class PostRestController {
	@Autowired(required = false)
	PostRepository postRepository;
	
	@PostMapping("/")
	public ResponseEntity<Void> addPost(@RequestBody Post post) {

		postRepository.save(post);
		return new ResponseEntity<>(HttpStatus.CREATED);
//		return Response.status(Status.CREATED).build();
	}

//	@GetMapping("/")
	@RequestMapping(value = "/",method = RequestMethod.GET)
	@ApiOperation(value = "Fetches all the Posts", response = Post.class, tags = "fetchAllPosts")
	public ResponseEntity<List<Post>> fetchAllPosts() {
		List<Post> posts = postRepository.findAll();
		return new ResponseEntity<>(posts, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAPost(@PathVariable("id") int id) {
		postRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
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
	
	
	@DeleteMapping("/{id}/comments")
	public ResponseEntity<Void> addCommentForAPost(@PathVariable("id") int id) {
		Optional<Post> postFound = postRepository.findById(id);
		if(postFound.isPresent()) {
			Post post =  postFound.get();
			List<Comment> comments = post.getComments();
			post.setComments(null);
			System.out.println(comments);	
			postRepository.save(post);
			 return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}/comments/{commentId}")
	public ResponseEntity<Void> deleteCommentForAPost(@PathVariable("id") int id, @PathVariable("commentId") int commentId) {
		System.out.println("In delete method" + id + " commentId " + commentId);
		Optional<Post> postFound = postRepository.findById(id);
		if(postFound.isPresent()) {
			System.out.println("post found ...");
			Post post =  postFound.get();
			List<Comment> comments = post.getComments();
			
			System.out.println(post);
			
			// delete for a specific ID
			List<Comment> filteredComments = comments.stream()
			.filter((c)-> c.getId()!=commentId)
			.collect(Collectors.toCollection(ArrayList::new));
			
			post.setComments(filteredComments);
			
//			System.out.println(comments);	
			postRepository.save(post);
			 return new ResponseEntity<>(HttpStatus.OK);
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
