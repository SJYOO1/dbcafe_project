package kr.co.dbcafe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.MenuYnService;
import kr.co.dbcafe.vo.MenuYnResDTO;
import kr.co.dbcafe.vo.MenuYnUpdateReqDTO;

@RestController
@RequestMapping("/menu")
public class MenuYnController {

	@Autowired
	private MenuYnService menuYnService;
	
	
	@GetMapping("/view")
	public List<MenuYnResDTO> menuList(HttpSession session) {
		String stNo = (String) session.getAttribute("stNo");
		List<MenuYnResDTO> list = menuYnService.menuList(stNo);
		return list; 
	}
	
	
	@PutMapping("/edit")
	public void updateMenuYn(@RequestBody MenuYnUpdateReqDTO menuYnUpdateReqDTO) {
		menuYnService.updateMenuYn(menuYnUpdateReqDTO);
	}
		
}
