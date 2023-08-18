package com.example.demo.Day1.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
@GetMapping("welc")
public String Welcome()
{
	return "Welcome String Boot!";
}
}
