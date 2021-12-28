package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String home() {

		return "home.jsp";
		
	}
	
	@RequestMapping("/add")
	public String add(Employee e) {
		System.out.println("employee added");
		repo.save(e);
		return "home.jsp";
		
	}
	
	@RequestMapping("/show")
	public ModelAndView show(@RequestParam int eid) {
		System.out.println("employee fetched");
		ModelAndView mv = new ModelAndView();
		Employee e = repo.findById(eid).orElse(new Employee());
		mv.addObject(e);
		mv.setViewName("show.jsp");
		return mv;
		
	}
	
	

}
