package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("home")
//	@ResponseBody // Responsebody will diplay the string type content
	public String home(HttpServletRequest req) {
		String name = req.getParameter("name");
		System.out.println("home is working");
		req.setAttribute("name", name);
		return "home";
	}
	
////	without using servletrequest
//	@RequestMapping("myhome")
//	public String home(String name, HttpSession session) {
//		System.out.println("home is working");
//		session.setAttribute("name", name);
//		return "home";
//	}
	
//	MOdel and View method
	@RequestMapping("myhome")
	public ModelAndView home(String name) {
		System.out.println("home is working");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",name);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("myobject")
	public ModelAndView object(Employee e) {
		System.out.println("employee is working");
		ModelAndView mv = new ModelAndView();
		e.setEid(1);
		e.setEname("hanuma");
		e.setEcompany("Mphasis");
		mv.addObject("obj",e);
		mv.setViewName("home");
		return mv;
	}
	
	
	

}
