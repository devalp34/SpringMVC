package com.pkg;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("showPage")
	public String showPage()
	{
		return "showPage";
	}
	
//	@RequestMapping("/processPage")
//	public String processPage()
//	{
//		return "showProcess";
//	}
	
//	@RequestMapping("processData")
//	public String toCapital(HttpServletRequest request, Model model)
//	{
//		String temp = request.getParameter("studentName");
//		temp = temp.toUpperCase()+"ya!";
//		model.addAttribute("msg", temp);
//		return "showProcess";
//	}
//	
	@RequestMapping("processData")
	public String toCapital(@RequestParam("studentName") String temp, Model model)
	{
		temp = temp.toUpperCase()+" Hello friends!";
		model.addAttribute("msg", temp);
		return "showProcess";
	}
}
