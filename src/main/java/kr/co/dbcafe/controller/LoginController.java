package kr.co.dbcafe.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.LoginService;
import kr.co.dbcafe.vo.LoginReqDTO;
import kr.co.dbcafe.vo.StoreDTO;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public String login(@ModelAttribute LoginReqDTO loginReqDTO, HttpSession httpSession) {
		log.info("받은값 : {}", loginReqDTO);
		boolean result = loginService.findById(loginReqDTO);
		if (result == true) {
			StoreDTO storeDTO = loginService.findStNm(loginReqDTO.getId());
			httpSession.setAttribute("stNo", storeDTO.getStNo());
			httpSession.setAttribute("stNm", storeDTO.getStNm());
			httpSession.setAttribute("id", loginReqDTO.getId());
		}
		return "index";
	}
	
	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
