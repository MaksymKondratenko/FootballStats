package com.maksymkondratenko.footballstats.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.maksymkondratenko.footballstats.model.Match;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AppController {
	private final static Logger logger = Logger.getLogger(AppController.class);
	
	@GetMapping({"/", "/home"})
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@GetMapping("/new-match")
	public String getNewMatchPage(ModelMap modelMap) {
		modelMap.addAttribute("match", new Match());
		return "new-match";
	}
	
	@PostMapping("/new-match-info")
	public String addNewMatch(@Valid @ModelAttribute("match") Match match, BindingResult result, ModelMap modelMap) {
		if(result.hasErrors()) {
			modelMap.addAttribute("errors", result.getAllErrors());
			return "new-match";
		} else {
			return "new-match-info";
		}
	}
	
	@GetMapping("/new-match-info")
	public String getMatchViewerPage() {
		return "new-match-info";
	}
	
}
