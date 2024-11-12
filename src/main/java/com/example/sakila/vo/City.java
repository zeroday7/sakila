package com.example.sakila.vo;

import lombok.Data;

@Data
public class City {
	private Integer cityId; // PK 
	private String city;
	private Integer countryId; // FK
	private String lastUpdate;
}
