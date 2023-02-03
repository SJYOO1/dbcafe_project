package kr.co.dbcafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.MenuYnServiceImpl;
import kr.co.dbcafe.vo.MenuYnResDTO;
import kr.co.dbcafe.vo.MenuYnUpdateReqDTO;

@RestController
@RequestMapping("/menu")
public class MenuYnController {

	@Autowired
	private MenuYnServiceImpl menuYnServiceImpl;
	
	@GetMapping(value = "/view")
	public List<MenuYnResDTO> menuList(@RequestParam("stNo") String stNo) {
		List<MenuYnResDTO> list = menuYnServiceImpl.menuList(stNo);
		return list; 
	}
	
	
	@PutMapping("/edit")
	public void updateMenuYn(@RequestBody MenuYnUpdateReqDTO menuYnUpdateReqDTO) {
		menuYnServiceImpl.updateMenuYn(menuYnUpdateReqDTO);
	}
}
