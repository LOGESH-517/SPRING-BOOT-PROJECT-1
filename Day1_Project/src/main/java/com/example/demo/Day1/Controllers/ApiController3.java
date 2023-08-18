package com.example.demo.Day1.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {
@Value("${var1}")
private String YourFavColor;
@GetMapping("color")
public String getMyFav()
{
	return "My favorite color is "+YourFavColor;
}
}