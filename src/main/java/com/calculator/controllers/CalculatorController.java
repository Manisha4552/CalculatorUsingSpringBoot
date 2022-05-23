package com.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.calculator.entities.Calculator;

@Controller
public class CalculatorController {

	@GetMapping("/index")
	public String viewForm(Model model) {
		model.addAttribute("Calculator", new Calculator());
		return "index";
		
	}
	
	@PostMapping(value="/Calculator", params="add")
	public String addForm(@ModelAttribute Calculator calculator, Model model) {
		model.addAttribute("result", calculator.add(calculator));
		return "answer";
		
	}
	
	@PostMapping(value="/Calculator", params="sub")
	public String subForm(@ModelAttribute Calculator calculator, Model model) {
		model.addAttribute("result", calculator.sub(calculator));
		return "answer";
		
	}
	
	@PostMapping(value="/Calculator", params="multiply")
	public String mulForm(@ModelAttribute Calculator calculator, Model model) {
		model.addAttribute("result", calculator.mul(calculator));
		return "answer";
		
	}
	
	@PostMapping(value="/Calculator", params="divide")
	public String divForm(@ModelAttribute Calculator calculator, Model model) {
		model.addAttribute("result", calculator.div(calculator));
		return "answer";
		
	}
}
