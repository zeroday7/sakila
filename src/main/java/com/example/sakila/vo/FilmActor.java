package com.example.sakila.vo;

import lombok.Data;

@Data
public class FilmActor {
	private Integer actorId; // PK
	private Integer filmId; // PK, FK
	private String lastUpdate;
}
