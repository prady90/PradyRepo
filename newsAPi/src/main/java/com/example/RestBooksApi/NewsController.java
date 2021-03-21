package com.example.RestBooksApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
	
	@Autowired
	private NewsService service;

@GetMapping("/getTopStories")	
public String getTopStories() {
	
	return service.getTopStories();
	
}
	
	
}
