package com.example.sakila.vo;

import lombok.Data;

@Data
public class Payment {
	private Integer paymentId; // PK
	private Integer customerId; // FK
	private Integer staffId; // FK
	private Integer rentalId; // FK
	private Double amount;
	private String paymentDate;
	private String lastUpdate;
}
