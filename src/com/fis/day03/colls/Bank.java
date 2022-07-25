package com.fis.day03.colls;

import java.util.List;

public class Bank {
	
	int id;
	String name;
	
	List<Branch> branches;
	
	List<Atm> atms;

	public Bank(int id, String name, List<Branch> branches, List<Atm> atms) {
		super();
		this.id = id;
		this.name = name;
		this.branches = branches;
		this.atms = atms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	public List<Atm> getAtms() {
		return atms;
	}

	public void setAtms(List<Atm> atms) {
		this.atms = atms;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branches=" + branches + ", atms=" + atms + "]";
	}
	
	
	

}
