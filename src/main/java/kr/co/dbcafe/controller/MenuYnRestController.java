package kr.co.dbcafe.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.MenuYnService;
import kr.co.dbcafe.vo.MenuYnUpdateReqDTO;

@RestController
public class MenuYnRestController {

	@Autowired
	private MenuYnService menuYnService;
	
	@PutMapping("/menu")
	public void updateMenuYn(HttpSession httpSession, @RequestBody MenuYnUpdateReqDTO menuYnUpdateReqDTO) {
		String stNo = (String)httpSession.getAttribute("stNo");
		menuYnService.updateMenuYn(stNo, menuYnUpdateReqDTO);
	}
		
}
