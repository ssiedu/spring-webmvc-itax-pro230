package com.ssi;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaxController {

	@Autowired
	private TaxService service;
	
	@RequestMapping("processtax")
	public ModelAndView doCalculation(@ModelAttribute("data") TaxModel model){
		service.computeTax(model);
		ModelAndView mv=new ModelAndView("taxinfo.jsp");
		return mv;
	}
	
	@RequestMapping("inputs")
	public String showInputPage(){
		return "details.jsp";
	}
	
}
