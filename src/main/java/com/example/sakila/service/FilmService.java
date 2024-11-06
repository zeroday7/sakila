package com.example.sakila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sakila.mapper.FilmMapper;
import com.example.sakila.vo.Film;

@Service
public class FilmService {
	@Autowired FilmMapper filmMapper;
	
	// /on/actorOne
	public List<Film> getFilmTitleListByActor(int actorId) {
		return filmMapper.selectFilmTitleListByActor(actorId);
	}
}
