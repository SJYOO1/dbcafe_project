package kr.co.dbcafe.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = { "/", "/index", "/home" })
	public String index(Model model) {
		model.addAttribute("serverTime",
				LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
		return "index";
	}

	@GetMapping(value = { "/index2", "/home2" })
	public String index2(Model model) {
		model.addAttribute("serverTime",
				LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
		return "index2";
	}

	@GetMapping(value = { "/index3", "/home3" })
	public String index3(Model model) {
		model.addAttribute("serverTime",
				LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
		return "index3";
	}
}
