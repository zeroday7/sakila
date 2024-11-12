package com.example.sakila.vo;

import lombok.Data;

@Data
public class Actor {
	private Integer actorId; // PK
	private String firstName;
	private String lastName; // FK
	private String lastUpdate;
}
