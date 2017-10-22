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
	public ModelAndView getNewMatchPage() {
		return new ModelAndView("new-match", "match", new Match());
	}
	
	@PostMapping("/new-match")
	public ModelAndView addNewMatch(@Valid @ModelAttribute("match") Match match, BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("new-match");
		}
		return new ModelAndView("new-match-info", "match", match);
	}
	
	@GetMapping("/match-viewer")
	public ModelAndView getMatchViewerPage(ModelAndView modelAndView) {
		modelAndView.addObject("match-viewer");
		return modelAndView;
	}
}
