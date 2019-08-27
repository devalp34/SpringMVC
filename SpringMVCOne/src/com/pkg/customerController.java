package com.pkg;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class customerController {

	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{ 
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}
	
	@RequestMapping("/customer-form")
	public String entry(Model model)
	{
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/cust-formProcess")
	public String process(@Valid @ModelAttribute("customer") Customer theCustomer,
							BindingResult theBr)
	{
		if(theBr.hasErrors()) return "customer-form";
		else
			return "Cust-Confirmation";
	}
}
