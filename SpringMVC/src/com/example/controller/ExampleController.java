package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleController {
	@RequestMapping("/")
	public ModelAndView demoMethod1(){
		System.out.println("in page 1");
		ModelAndView andView=new ModelAndView();
		andView.addObject("msg", "Im from controller");
		andView.setViewName("page1");
		return andView;
	}

	@RequestMapping("/page2")
	public ModelAndView demoMethod2(){
		System.out.println("in page 2");
		ModelAndView andView=new ModelAndView();
		andView.addObject("msg", "Im from controller");
		andView.setViewName("page2");
		return andView;
	}
}
