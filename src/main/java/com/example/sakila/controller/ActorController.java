package com.example.sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.sakila.service.ActorFileService;
import com.example.sakila.service.ActorService;
import com.example.sakila.service.FilmService;
import com.example.sakila.vo.Actor;
import com.example.sakila.vo.ActorFile;
import com.example.sakila.vo.ActorForm;
import com.example.sakila.vo.Film;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ActorController {
	@Autowired ActorService actorService;
	@Autowired ActorFileService actorFileService;
	@Autowired FilmService filmService;
	
	@GetMapping("/on/removeActor")
	public String removeActor(HttpSession session, @RequestParam int actorId) {
		String path = session.getServletContext().getRealPath("/upload/");
		actorService.removeActor(actorId, path);
		return "redirect:/on/actorList";
	}
	
	@PostMapping("/on/modifyActor")
	public String modifyActor(Actor actor) {
		log.debug(actor.toString());
		
		int row = actorService.modifyActor(actor);
		
		return "redirect:/on/actorOne?actorId="+actor.getActorId();
	}
	@GetMapping("/on/modifyActor")
	public String modifyActor(Model model, @RequestParam int actorId) {
		Actor actor = actorService.getActorOne(actorId);
		model.addAttribute("actor", actor);
		return "on/modifyActor";
	}
	
	@GetMapping("/on/actorOne")
	public String actorOne(Model model
							, @RequestParam int actorId
							, @RequestParam(defaultValue = "") String searchTitle) {
		// searchWord = ""이면 actorOne상세보기 요청이고, ""아니면 film검색 요청
		Actor actor = actorService.getActorOne(actorId);
		List<ActorFile> actorFileList = actorFileService.getActorFileListByActor(actorId);
		List<Film> filmList = filmService.getFilmTitleListByActor(actorId);
		log.debug(actor.toString());
		log.debug(actorFileList.toString());
		log.debug(filmList.toString());
		
		if(searchTitle.equals("") == false) { // 필름 제목 검색어가 있다면
			// film검색결과 리스트를 추가
			List<Film> searchFilmList = filmService.getFilmListByTitle(searchTitle);
			model.addAttribute("searchFilmList",searchFilmList);
		}
		
		model.addAttribute("actor", actor);
		model.addAttribute("actorFileList", actorFileList);
		model.addAttribute("filmList", filmList);
		
		return "on/actorOne";
	}
	
	@GetMapping("/on/actorList")
	public String actorList(Model model
							, @RequestParam(defaultValue = "1") int currentPage
							, @RequestParam(defaultValue = "10") int rowPerPage
							, @RequestParam(required = false) String searchWord) {
		log.debug("searchWord: "+ searchWord);
		
		// int lastPage = actorService.getTotalCount(rowPerPage, searchWord);
		List<Actor> actorList = actorService.getActorList(currentPage, rowPerPage, searchWord);
		model.addAttribute("actorList", actorList);
		
		return "on/actorList";
	}
	
	@PostMapping("/on/addActor")
	public String addActor(HttpSession session
						, Model model
						, ActorForm actorForm) { // input type="file"
		
		List<MultipartFile> list = actorForm.getActorFile();
		if(list != null && list.size() != 0) { // 첨부된 파일이 있다면
			for(MultipartFile f : list) { // 이미지파일은 *.jpg or *.png 가능
				if(f.getContentType().equals("image/jpeg") == false
						&& f.getContentType().equals("image/png") == false) {
					model.addAttribute("msg", "이미지 파일만 입력이 가능합니다");
					return "on/addActor";
				}
			}
		}
		
		String path = session.getServletContext().getRealPath("/upload/");
		log.debug(path);
		
		actorService.addActor(actorForm, path);
		
		return "redirect:/on/actorList";
	}	
	
	@GetMapping("/on/addActor")
	public String addActor() {
		return "on/addActor";
	}
	

}
