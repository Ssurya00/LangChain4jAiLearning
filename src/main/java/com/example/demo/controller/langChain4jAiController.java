package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.langChain4jAiService;


@RestController
@RequestMapping("/api/ai-support")
public class langChain4jAiController {
	
	private langChain4jAiService agent;
	
	public langChain4jAiController(langChain4jAiService agent) {
		this.agent = agent;
	}

	@GetMapping
	public String getMessage(@RequestParam String message) {
		return agent.chat(message);
		
	}
	

}
