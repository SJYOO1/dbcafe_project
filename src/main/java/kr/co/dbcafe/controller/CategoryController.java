package kr.co.dbcafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

	// 폼을 띄운다.
	@GetMapping(value = {"/categoryDate"})
	public String index(Model model){
		return "category";
	}
}
