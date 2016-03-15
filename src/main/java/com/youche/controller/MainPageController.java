package com.youche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "index";
	}
}
