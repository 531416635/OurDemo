package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/web")
public class WebController {

	@RequestMapping(value="/index")
	public String testd(){
		return "website/index";
	}
}
