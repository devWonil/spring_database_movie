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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Score {
	
	@Id
	@JoinColumn(name = "title")
	@OneToOne(fetch = FetchType.EAGER)
	private Movie movie;
	
	@Column(nullable = true)
	private int audience;
	
	@Column(columnDefinition = "Decimal(65,0)")
	private double sales;
}
