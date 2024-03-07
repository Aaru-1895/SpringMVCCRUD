package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Subject;
import com.demo.model.User;
import com.demo.service.SubjectService;
import com.demo.service.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	SubjectService subjectService;
	
	
	@GetMapping("/")
	public String getRegistration(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@PostMapping("/saveRegitration")
	public String saveData(@ModelAttribute("user") User user) {
		userService.saveOrUpdate(user);
		return "redirect:/viewAllUser";
	}
	
	@GetMapping("/viewAllUser")
	public String getALL(Model model) {
		List<User> userList=userService.getAllUser();
		model.addAttribute("userList",userList);
	   return "viewUser";
	}
	
	@GetMapping("/editInfo/{id}")
	public String getInfo(@PathVariable("id") int id,Model model) {
		User user = userService.getuserById(id);
		model.addAttribute("user", user);
		return "edit";
	}
	
	@GetMapping("/deleteInfo/{id}")
	public String delete(@PathVariable("id") int id) {
		userService.deleteUser(id);
		return "redirect:/viewAllUser";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute("user") User user){
		userService.saveOrUpdate(user);
		return "redirect:/viewAllUser";
		
	}
	
	@GetMapping("/subject")
		public String subject(Model model) {
			model.addAttribute("subject", new Subject());
			return "subject";
	}
	
	
	@PostMapping("/saveSubject")
	public String save(@ModelAttribute("subject") Subject subject) {
		subjectService.saveSubject(subject);
		return "subject";
	}
	
	@ModelAttribute
    public void addAttributes(Model model) {
		List<Subject> subjectList = subjectService.getAll();
		System.out.println("subjectList.."+subjectList.toString());
        model.addAttribute("subjects", subjectList);
    }
	
	

}
