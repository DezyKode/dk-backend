package com.DezyKode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table

public class Subscriber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Subscriber(Long id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	public Subscriber() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", email=" + email + "]";
	}


	
}
