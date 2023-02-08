package kr.co.dbcafe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.LoginDAO;
import kr.co.dbcafe.vo.AccountDTO;
import kr.co.dbcafe.vo.LoginReqDTO;
import kr.co.dbcafe.vo.StoreDTO;


@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDAO loginDAO;

	@Override
	public boolean findById(LoginReqDTO loginReqDTO) {
		boolean result = false;
		try {
			AccountDTO accountDTO = loginDAO.findById(loginReqDTO.getId());
			if(accountDTO != null) {
				if(accountDTO.getPassword().equals(loginReqDTO.getPassword())) {
					 return true; // 로그인 성공
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}


	public StoreDTO findStNm(String id){
		StoreDTO storeDTO = null;
		try {
			storeDTO = loginDAO.findStNm(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return storeDTO;
	}
	
}
