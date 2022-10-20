package com.learn.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.learn.helper.Student;

@Controller
public class HomeController {
	
	@Autowired
	private Student student;
	
	
	@GetMapping("/get-data")
	public Map<String,String> getdata(){
		return Map.of("Name","Manthan Bhagtani");
	}
}
