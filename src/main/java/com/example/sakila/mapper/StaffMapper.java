package com.example.sakila.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.sakila.vo.Staff;

@Mapper
public interface StaffMapper {
	// /on/staffOne.jsp
	Staff selectStaffOne(int staffId);
	
	// /off/login.jsp
	Staff login(Staff staff);
}
