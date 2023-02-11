package kr.co.dbcafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TermController {

	@GetMapping(value = { "/term.html", "/term" })
	public String index2(Model model) {
		return "term";
	}
}
