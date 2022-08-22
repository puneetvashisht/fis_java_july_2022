package com.fis.springbootjaxrsadv.resources;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.fis.springbootjaxrsadv.entities.Comment;
import com.fis.springbootjaxrsadv.entities.Post;
import com.fis.springbootjaxrsadv.respositories.PostRepository;

@Path("/posts")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class PostResource {
	
	@Autowired
	PostRepository postRepository;
	
	@POST
	public Response addPost(Post post) {
//		
//		return null;
		postRepository.save(post);
		return Response.status(Status.CREATED).build();
	}

	@GET
	public Response fetchAllPosts() {
		List<Post> posts = postRepository.findAll();
		return Response.ok(posts).build();
	}
	
	@Path("{id}/comments")
	@GET
	public Response fetchAllCommentsForAPost(@PathParam("id") int id) {
		Optional<Post> postFound = postRepository.findById(id);
		if(postFound.isPresent()) {
			Post post =  postFound.get();
			List<Comment> comments = post.getComments();
			System.out.println(comments);	
			return Response.ok(comments).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	
	@Path("{id}/comments")
	@POST
	public Response addCommentForAPost(@PathParam("id") int id, Comment comment) {
		Optional<Post> postFound = postRepository.findById(id);
		if(postFound.isPresent()) {
			Post post =  postFound.get();
			List<Comment> comments = post.getComments();
			comments.add(comment);
			System.out.println(comments);	
			postRepository.save(post);
			return Response.ok(comments).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	
	@Path("{id}")
	@GET
	public Response fetchPostById(@PathParam("id") int id) {
		Optional<Post> postFound = postRepository.findById(id);
		if(postFound.isPresent()) {
			Post post =  postFound.get();
			List<Comment> comments = post.getComments();
			System.out.println(comments);
			
			return Response.ok(post).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}

}
