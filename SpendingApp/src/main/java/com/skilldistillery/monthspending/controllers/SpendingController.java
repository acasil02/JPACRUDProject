package com.skilldistillery.monthspending.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.monthspending.data.SpendingDAO;

@Controller
public class SpendingController {

	@Autowired
	private SpendingDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		model.addAttribute("DEBUG", dao.findById(1));
		return "index";
	}

}
