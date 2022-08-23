package com.fis.springbootadv.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Post {
	
	@ApiModelProperty(notes = "Post Id", name = "id", required=true, value = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@ApiModelProperty(notes = "Post title", name = "title", required=true, value = "test title")
	String title;
	
	@ApiModelProperty(notes = "Post summary", name = "summary", required=true, value = "test summary")
	String summary;
	
	@ApiModelProperty(notes = "Post summary", name = "summary", required=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<Comment> comments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", summary=" + summary + ", comments=" + comments + "]";
	}
	
	
	
}
