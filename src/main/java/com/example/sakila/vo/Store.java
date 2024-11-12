package com.example.sakila.vo;

import lombok.Data;

@Data
public class Store {
	private Integer storeId; // PK
	private Integer managerStaffId; //
	private Integer addressId; // FK
	private String lastUpdate;
}
