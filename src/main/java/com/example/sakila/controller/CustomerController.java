package com.example.sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sakila.service.AddressService;
import com.example.sakila.service.CustomerService;
import com.example.sakila.service.StoreService;
import com.example.sakila.vo.Address;
import com.example.sakila.vo.Customer;
import com.example.sakila.vo.Store;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CustomerController {
	@Autowired CustomerService customerService;
	@Autowired StoreService storeService;
	@Autowired AddressService addressService;
	
	@GetMapping("/on/addCustomer")
	public String addCustomer(Model model
							, @RequestParam(required = false) String searchAddress) {
		// sotreList <--
		List<Store> storeList = storeService.getStoreList();
		model.addAttribute("storeList", storeList);
		
		// addressList <-- 검색 searchAddress != null
		if(searchAddress != null && !searchAddress.equals("")) {
			List<Address> addressesList = addressService.getAddressListByWord(searchAddress);
			model.addAttribute("addressesList", addressesList);
		}
		
		return "on/addCustomer";
	}
	
	@PostMapping
	public String addCustomer(Customer customer) {
		// 고객추가
		Integer row = customerService.addCustomer(customer);
		return "redirect:/on/customerList";
	}
}
