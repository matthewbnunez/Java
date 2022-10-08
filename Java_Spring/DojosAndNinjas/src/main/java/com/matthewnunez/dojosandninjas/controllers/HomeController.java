package com.matthewnunez.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.matthewnunez.dojosandninjas.models.Dojo;
import com.matthewnunez.dojosandninjas.models.Ninja;
import com.matthewnunez.dojosandninjas.services.DojoService;
import com.matthewnunez.dojosandninjas.services.NinjaService;

@Controller
public class HomeController {
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String ninjaDashboard(Model model) {
		model.addAttribute("dojoList", dojoService.getAllDojos());
		model.addAttribute("ninjaList", ninjaService.getAllNinjas());
		return "ninjaDashboard.jsp";
	}
	
	// Dojo Form
	@GetMapping("/dojos/new")
	public String showDojoForm(Model model) {
		model.addAttribute("newDojo", new Dojo());
		return "newDojo.jsp";
	}
	
	// Dojo Process
	@PostMapping("/dojos/process")
	public String processDojoForm(
	@Valid @ModelAttribute("newDojo") Dojo dojo,
	BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/";
		}
	}
	
	// Ninja Form
	@GetMapping("/ninjas/new")
	public String showNinjaForm(Model model) {
		model.addAttribute("newNinja", new Ninja());
		model.addAttribute("dojoList", dojoService.getAllDojos());
		return "newNinja.jsp";
		
	}
	
	// Ninja Process
	@PostMapping("/ninjas/process")
	public String processDojoForm(
	@Valid @ModelAttribute("newNinja") Ninja ninja,
	BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojoList", dojoService.getAllDojos());
			return "newNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/";
		}
	}
	
	// Get One Dojo
	@GetMapping("/dojos/{id}")
	public String dojoDetails(@PathVariable("id") Long id, Model model) {
		Dojo foundDojo = dojoService.getOneDojo(id);
		model.addAttribute("dojo", foundDojo);
		return "OneDojo.jsp";
	}
}
