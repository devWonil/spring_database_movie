package com.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 20)
	private String actorname;
	
	@Column(nullable = false)
	private int birthyear;
	
	@Column(nullable = false)
	private int height;
	
	@Column(nullable = false)
	private int weight;
	
	@Column(nullable = true, length = 20)
	private String partner;
	
	@Lob
	private String image;
}
