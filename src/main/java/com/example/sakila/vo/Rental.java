package com.example.sakila.vo;

import lombok.Data;

@Data
public class Rental {
	private Integer rentalId; // PK
	private String rentalDate;
	private Integer inventoryId; // FK
	private Integer customerId; // FK
	private String returnDate;
	private Integer staffId; // FK
	private String lastUpdate;
}
