package com.example.sakila.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sakila.mapper.AddressMapper;
import com.example.sakila.mapper.StaffMapper;
import com.example.sakila.mapper.StoreMapper;
import com.example.sakila.vo.Address;
import com.example.sakila.vo.Staff;
import com.example.sakila.vo.Store;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class StaffController {
	@Autowired StaffMapper staffMapper;
	@Autowired StoreMapper storeMapper;
	@Autowired AddressMapper addressMapper;
	
	// leftMenu.a태그, addStaff.주소검색
	@GetMapping("/on/addStaff")
	public String addStaff(Model model
							, @RequestParam(defaultValue = "") String searchAddress) {
		// model(storeList)
		log.debug("searchAddress: "+ searchAddress);
		
		List<Store> storeList = storeMapper.selectStoreList();
		model.addAttribute("storeList", storeList);
		
		// model(addressList) <- searchAddress가 공백이 아니면 검색후
		if(searchAddress.equals("") == false) {
			List<Address> addressList = addressMapper.selectAddressListByWord(searchAddress);
			log.debug(addressList.toString());
			model.addAttribute("addressList", addressList);
		}
		return "on/addStaff";
	}
	
	@PostMapping("/on/addStaff")
	public String addStaff(Staff staff) { // 커맨드 객체 생성-> 커맨드객체.set(reuqest.getParameter())
		// insert호출
		return "redirect:/on/staffList";
	}
	
	@GetMapping("/on/staffList")
	public String staffList(Model model
							, @RequestParam(defaultValue = "1") int currentPage) {
		// model(staffList)
		return "on/staffList";
	}
	
	@GetMapping("/on/staffOne")
	public String staffOne(HttpSession session, Model model) {
		int staffId = ((Staff)(session.getAttribute("loginStaff"))).getStaffId();
		Map<String, Object> staff = staffMapper.selectStaffOne(staffId);
		model.addAttribute("staff", staff);
		log.debug(staff.toString());
		return "on/staffOne";
	}
}
