package com.example.sakila.vo;

import lombok.Data;

@Data
public class Country {
	private Integer countryId; // PK
	private String country;
	private String lastUpdate;
}
