package com.pkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/student-form")
	public String temp(Model model)
	{
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		return "student-form";
	}
	
	@RequestMapping("/processingForm")
	public String handleForm(@ModelAttribute("student") Student theStudent)
	{
		return "student-confirmation";
	}
}
