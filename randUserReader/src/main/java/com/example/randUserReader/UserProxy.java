package com.example.randUserReader;
// Proxy class

import org.apache.tomcat.util.json.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class UserProxy {

	public static void main(String[] args) {}

	public static List<MyUser> getProductAsJson(int numUsers) {
		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "https://randomuser.me/api/?results=" + numUsers;
		MyResult result = restTemplate.getForObject(resourceUrl, MyResult.class);
		List<MyUser> users = result.getResults();
		return users;
	}


}
