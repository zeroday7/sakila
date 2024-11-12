package com.example.sakila.vo;

import lombok.Data;

@Data
public class Staff {
	private Integer staffId; // PK
	private String firstName;
	private String lastName;
	private Integer addressId; // FK
	private String email;
	private Integer storeId; // FK
	private Integer active;
	private String username;
	private String password;
	private String lastUpdate;
}
