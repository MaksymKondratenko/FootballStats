package com.maksymkondratenko.footballstats.controllers;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	private final static int NEGATIVE_SCORE = -1;
	private final static int UNREAL_HUGE_SCORE = 20;
	
	/*Opening homepage*/
	@GetMapping({"/", "/home"})
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	/*Opening a page, where new match is added*/
	@GetMapping("/new-match")
	public String getNewMatchPage(ModelMap modelMap) {
		modelMap.addAttribute("match", new Match());
		return "new-match";
	}
	
	/*Validates the match info provided and posts data*/
	@PostMapping("/new-match-info")
	public String addNewMatch(@Valid @ModelAttribute("match") Match match, BindingResult result, ModelMap modelMap) {
		if(result.hasErrors()) {
			modelMap.addAttribute("errors", result.getAllErrors());
			return "new-match";
		} else {
			modelMap.addAttribute("matches", match);
			return "new-match-info";
		}
	}
	
	/*Opens the info page about added match data*/
	@GetMapping("/new-match-info")
	public String getMatchViewerPage() {
		return "new-match-info";
	}
	
	/*Opens the page with a list of added matches
	@GetMapping("/match-viewer")
	public String getMatchViewer(ModelMap modelMap) {
		return "match-viewer";
	}*/

	@RequestMapping(value = "/checkHomeScore", method=RequestMethod.GET, produces = {"text/html; charset=UTF-8"})
	@ResponseBody
	public String checkHomeScore(@RequestParam String homeScore) {
		//localization needed
		int scoreInt = Integer.parseInt(homeScore);
		if(scoreInt <= NEGATIVE_SCORE) {
			return "Not real score";
		} else if (scoreInt >= UNREAL_HUGE_SCORE) {
			return "Unreal huge score";
		}
		return "";
	}
}
