package com.example.sakila.vo;

import lombok.Data;

@Data
public class Inventory {
	private Integer inventoryId; // PK
	private Integer filmId; // FK
	private Integer storeId; // FK
	private String lastUpdate;
}
