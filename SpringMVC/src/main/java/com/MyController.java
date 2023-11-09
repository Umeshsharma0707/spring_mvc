package com;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class MyController {
	@Autowired
	private Dao  dao;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
//	@RequestMapping("/")
//	public String indexPage(Model m) {
//		m.addAttribute("num", 123);
//		
//		List<String> list = new ArrayList<String>();
//		
//		list.add("c");
//		list.add("c++");
//		list.add("java");
//		list.add("python");
//		
//		m.addAttribute("list", list);
//		return "index";
//		
//	}
	
	
	@RequestMapping("/register")
	public 
}
