package com.srikanth.springboot.mvc.springbootmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.srikanth.springboot.mvc.springbootmvc.pojo.Department;


@Controller
public class DepartmentController {
	
	static List<Department> departmentList = new ArrayList<>();
	
	static{
		
		departmentList.add(new Department("CSE","Computer Science","Kate"));
		departmentList.add(new Department("IT","Information Technology","Sweet"));
		departmentList.add(new Department("EEE","Electrical","Mike"));
		departmentList.add(new Department("Mechanical","Mechanical","Tony"));
		departmentList.add(new Department("Production","Production","Crista"));
	}
	
	@RequestMapping(value="/getDeprtments", method = RequestMethod.GET)
	public ModelAndView getDeprtmentDetails(ModelAndView model){
		ModelAndView mv = new ModelAndView("Departments");		
		mv.addObject(departmentList);
		return mv;
	}
	
	@RequestMapping(value="/LoadDeprtments", method = RequestMethod.GET)
	public ModelAndView loadDeprtment(@ModelAttribute Department departmentModel,Model model){
		model.addAttribute("department",new Department());
		ModelAndView mv = new ModelAndView("AddDepartments");		
		return mv;
	}
	
	
	
	@RequestMapping(value="/addDepartment", method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Department departmentModel,Model model) {
		ModelAndView mv = new ModelAndView("Departments");	
		departmentList.add(departmentModel);
		mv.addObject(departmentList);
		return mv;
	}


}
