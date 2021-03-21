package com.example.RestBooksApi;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
	private RestTemplate restTemplate;
	
	public NewsService() {
		 restTemplate = new RestTemplate();
	}

	
	public String getTopStories() {
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<String> entity = restTemplate.exchange("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=iJOdd7bWj174xrOSw5vfF2I1lFDBQUM9", 
				HttpMethod.GET, 
				requestEntity, String.class);
		
		if(entity.getStatusCode()== HttpStatus.OK) {
			return entity.getBody();
		}
		return null;
	}
	
}
