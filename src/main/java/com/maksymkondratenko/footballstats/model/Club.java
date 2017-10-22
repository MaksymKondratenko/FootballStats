package com.maksymkondratenko.footballstats.model;

import org.hibernate.validator.constraints.NotBlank;

public class Club {
	
	@NotBlank(message = "Cannot be blank")
	private String name;
	
	public Club(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.getName();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
