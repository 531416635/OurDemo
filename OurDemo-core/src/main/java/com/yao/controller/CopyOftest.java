package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class CopyOftest {

	@RequestMapping(value="/index")
	public String testd(){
		return "adminsite/index";
	}
}
