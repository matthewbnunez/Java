package com.matthewnunez.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiFormController {
	// ----------Show Form----------
	@GetMapping("/omikuji")
	public String showsearchForm() {
		return "/searchForm/searchForm.jsp";
	}
	
	// -----------Process Form----------
	@PostMapping("/omikuji/process")
	public String processForm(
			@RequestParam("numberPick") Integer numberPick,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("living") String living,
			@RequestParam("comment") String comment,
			HttpSession session) {
		session.setAttribute("numberPick", numberPick);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("comment", comment);
		return "redirect:/omikuji/show";
	}
	
	// -----------Display Form----------
	@GetMapping("/omikuji/show")
	public String displaySearchResult() {
		return "/searchForm/searchResult.jsp";
	}
}
