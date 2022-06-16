package com.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Role {

	@Id
	@JoinColumn(name = "title")
	@OneToOne(fetch = FetchType.EAGER)
	private Movie movie;
	
	@JoinColumn(name = "actorname")
	@Column(nullable = false, length = 20)
	private Actor actorname;
	
	@Column(nullable = true, length = 2)
	private String category;
	
	@Column(nullable = true, length = 20)
	private String roleName;
	
}
