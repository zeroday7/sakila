package com.example.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sakila.service.FilmCategoryService;
import com.example.sakila.vo.FilmCategory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class FilmCategoryController {
	@Autowired FilmCategoryService filmCategoryService;
	
	@PostMapping("/on/addFilmCategory")
	public String addFilmCategory(FilmCategory filmCategory) {
		log.debug("=============filmCategory================="+filmCategory.toString());
		
		int row = filmCategoryService.addFilmCategory(filmCategory);
		
		return "redirect:/on/filmOne?filmId="+filmCategory.getFilmId();
	}
}
