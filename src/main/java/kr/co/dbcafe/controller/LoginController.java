package kr.co.dbcafe.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.dbcafe.service.LoginService;
import kr.co.dbcafe.vo.LoginReqDTO;
import kr.co.dbcafe.vo.StoreDTO;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/loginCheck")
	public String login(@ModelAttribute LoginReqDTO loginReqDTO ,HttpSession httpSession) {
		boolean result = loginService.findById(loginReqDTO);
		String result2 = "";
		if (result == true) {
			StoreDTO storeDTO = loginService.findStNm(loginReqDTO.getId());
			httpSession.setAttribute("stNo", storeDTO.getStNo());
			httpSession.setAttribute("stNm", storeDTO.getStNm());
			httpSession.setAttribute("id", loginReqDTO.getId());
			result2 = "index";
			}else { 
				result2 = "login";
		}
		return result2;
	}
	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
		}
}
