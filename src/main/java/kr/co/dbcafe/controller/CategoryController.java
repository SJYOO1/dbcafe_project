package kr.co.dbcafe.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

	// 폼을 띄운다.
	@GetMapping(value = {"/categoryDate.html","/categoryDate"})
	public String index(HttpSession httpSession){
		String page = "";
		String stNo = (String)httpSession.getAttribute("stNo");
		if(stNo==null) {
			page = "login";
		}else {
			page = "categoryDate";
		}
		return page;
	}
	
	@GetMapping(value = {"/login"})
	public String login(Model model){
		return "login";
	}
}
