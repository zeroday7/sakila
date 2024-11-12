package com.example.sakila.vo;

import lombok.Data;

@Data
public class Address {
	private Integer addressId; // PK
	private String address;
	private String address2;
	private String district;
	private Integer cityId; // FK
	private String postalCode;
	private String phone;
	private String lastUpdate;
}
