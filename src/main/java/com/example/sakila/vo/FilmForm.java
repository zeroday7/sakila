package com.example.sakila.vo;

import java.util.List;

import lombok.Data;

@Data
public class FilmForm {
	private String title; 
	private String description; // NULL
	private Integer releaseYear; // NULL
	private Integer languageId; 
	private Integer originalLanguageId; // NULL
	private Integer rentalDuration;
	private Double rentalRate;
	private Integer length; // 기본값 NULL
	private Double replacementCost;
	private String rating; 
	
	private List<String> specialFeatures; // 기본값 NULL
	// private String[] specialFeatures;
}