//package com.fis.springbootadv.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fis.springbootadv.repositories.CommentRepository;
//
//
//
//@RestController
//@RequestMapping("/comments")
//public class CommentRestController {
//	@Autowired
//	CommentRepository commentRepository;
//	
//	
//	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> deleteAComment(@PathVariable("id") int id) {
//		commentRepository.deleteById(id);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//	
//	
//	
//}
