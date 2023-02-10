package kr.co.dbcafe.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainGoalController {
	
	@GetMapping(value = {"/main", "index.html"})
	public String index(HttpSession httpSession){
		String page = "";
		String stNo = (String)httpSession.getAttribute("stNo");
		if(stNo==null) {
			page = "login";
		}else {
			page = "index";
		}
		return page;
	}
}
