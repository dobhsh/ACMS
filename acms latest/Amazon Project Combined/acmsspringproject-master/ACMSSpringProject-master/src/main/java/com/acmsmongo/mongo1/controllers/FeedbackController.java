package com.acmsmongo.mongo1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.acmsmongo.mongo1.model.Feedback;
import com.acmsmongo.mongo1.repository.FeedbackMongoRepository;
import com.acmsmongo.mongo1.repository.FeedbackSearchRepository;


@Controller
public class FeedbackController {

	@Autowired
	FeedbackMongoRepository feedbackRepository;
	
	@Autowired
	FeedbackSearchRepository feedbacksearchRepository;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("feedbackList", feedbackRepository.findAll());
		return "home";
	}
	
	@RequestMapping(value = "/addFeedback", method = RequestMethod.POST)
	public String addFeedback(@ModelAttribute Feedback feedback) {
		feedbackRepository.save(feedback);
		return "redirect:home";
	} 
	
	@RequestMapping(value = "/search")
	public String search(Model model, @RequestParam String search) {
		model.addAttribute("feedbackList", feedbacksearchRepository.searchFeedbacks(search));
		model.addAttribute("search", search);
		return "home";
	}
	
	@RequestMapping("/Submit")
	public String Submit() {
	    return "Submit";
	}
	
}
