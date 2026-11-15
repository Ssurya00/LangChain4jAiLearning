package com.example.demo.service;

import dev.langchain4j.service.spring.AiService;

@AiService
public interface langChain4jAiService {

	String chat(String message);
}

