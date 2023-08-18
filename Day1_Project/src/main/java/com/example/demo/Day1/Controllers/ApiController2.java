package com.example.demo.Day1.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
@Value("${var}")
private String name;
@GetMapping("student")
public String getName()
{
	return "Welcome "+name;
}
}
