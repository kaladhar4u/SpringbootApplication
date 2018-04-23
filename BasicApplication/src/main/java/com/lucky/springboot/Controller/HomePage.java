package com.lucky.springboot.Controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomePage {
	
//	@RequestMapping("/")
//	public String landingPage() {
//		return "Loaded Page from SpringBoot Application from different packages";
//	}
	@RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome Lucky");
        return "index";
    }
     
    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }
//        @RequestMapping("/login")
//        public String login() {
//        	return "login";
//        	
//        }
   
    @RequestMapping(value = "/login" , produces = {"application/JSON"})
    public String login(@RequestParam(value="first_name") String first_name,@RequestParam(value="last_name") String last_name) {
    	return "login attribute";
    	
    }
    
    @RequestMapping("list")
    String list() {
    	return "list";
    }
}
