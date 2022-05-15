package com.skilldistillery.monthspending.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.monthspending.data.SpendingDAO;
import com.skilldistillery.monthspending.entities.Spending;

@Controller
public class SpendingController {

	@Autowired
	private SpendingDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		model.addAttribute("DEBUG", dao.findById(1));
		return "index";
	}

	@RequestMapping(path = "getSpending.do", method = RequestMethod.GET)
	public String singleSpending(int id, Model model) {
		List<Spending> spendings = new ArrayList<>();
		spendings.add(dao.findById(id));
		model.addAttribute("spendings", spendings);
		return "spending/results";
	}

	@RequestMapping(path = "getAllSpendings.do")
	public String getAllSpendings(Model model) {
		List<Spending> spendings = dao.findAllSpendings();
		model.addAttribute("spendings", spendings);
		return "spending/results";
	}

	@RequestMapping(path = "addSpendingForm.do", method = RequestMethod.POST)
	public String addSpending(RedirectAttributes redir, Spending spending) {
		spending = dao.addNewSpending(spending);
		boolean addSpendingFlag = true;
		redir.addFlashAttribute("addSpendingFlag", addSpendingFlag);
		redir.addFlashAttribute("spending", spending);
		return "redirect:addSpendingForm.do";
	}

	@RequestMapping(path = "addSpendingForm.do", method = RequestMethod.GET)
	public String addSpendingGetProcess(Spending spending) {
		return "spending/detailedResults";
	}

	@RequestMapping(path = "addSpending.do")
	public String addSpendingPage() {
		return "spending/addSpending";
	}

	@RequestMapping(path = "deleteSpending.do", method = RequestMethod.POST)
	public String deleteSpending(RedirectAttributes redir, int id) {
		boolean containsFlag = dao.deleteSpending(id);
		boolean deleteSpendingFlag = true;
		redir.addFlashAttribute("deleteSpendingFlag", deleteSpendingFlag);
		redir.addFlashAttribute("containsFlag", containsFlag);
		return "redirect:deleteSpending.do";
	}

	@RequestMapping(path = "deleteSpending.do", method = RequestMethod.GET)
	public String deleteSpendingGetProcess(Spending spending) {
		return "spending/detailedResults";
	}

	@RequestMapping(path = "updateSpendingForm.do", method = RequestMethod.POST)
	public String updateSpending(RedirectAttributes redir, Spending spending) {
		boolean updateSpendingFlag = true;
		spending = dao.updateSpending(spending);
		redir.addFlashAttribute("updateSpendingFlag", updateSpendingFlag);
		redir.addFlashAttribute("spending", spending);
		return "redirect:updateSpendingForm.do";
	}

	@RequestMapping(path = "updateSpendingForm.do", method = RequestMethod.GET)
	public String updateSpendingGetProcess(Spending spending) {
		return "spending/detailedResults";
	}

	@RequestMapping(path = "updateSpending.do")
	public String updateSpendingPage(Model model, int id) {
		Spending spending = dao.findById(id);
		model.addAttribute("spending", spending);
		return "spending/updateSpending";
	}

}
