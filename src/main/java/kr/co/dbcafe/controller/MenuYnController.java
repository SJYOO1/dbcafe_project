package kr.co.dbcafe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.dbcafe.service.MenuYnService;
import kr.co.dbcafe.vo.MenuYnResDTO;

@Controller
public class MenuYnController {
	
	@Autowired
	private MenuYnService menuYnService;
	
	@GetMapping("/menu")
	public String menu(HttpSession httpSession, Model model){
		String stNo = (String)httpSession.getAttribute("stNo");
		List<MenuYnResDTO> menuList = menuYnService.menuList(stNo);
		model.addAttribute("menuList", menuList);
		return "menu";
	}
		
}