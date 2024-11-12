package com.example.sakila.vo;

import lombok.Data;

@Data
public class Customer {
	private Integer customerId; // PK
	private Integer storeId; // FK
	private String firstName;
	private String lastName; // FK
	private String email;
	private Integer addressId; // FK
	private Integer active;
	private String createDate;
	private String lastUpdate;
}
