package com.jordanpitlor.dacattendanceapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String getHome() {
		// Figure out the user?
		String user = "disney";
		return user.equals("disney") ? "admin_home" : "student_home";
	}
}
