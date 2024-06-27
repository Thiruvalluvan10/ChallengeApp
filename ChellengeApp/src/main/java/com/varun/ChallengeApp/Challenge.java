package com.varun.ChallengeApp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Challenge {
	
	@Id
	private Long id;
	
	@Column(name="challengeMonth")
	private String month;
	private String description;
	
	
	public Challenge()
	{
		
	}
	
	
	public Challenge(Long id, String month, String description) {
		this.id = id;
		this.month = month;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
