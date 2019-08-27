package com.pkg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String HandlePage()
	{
		System.out.println("Hello!");
		return "mainPage";
	}
}
