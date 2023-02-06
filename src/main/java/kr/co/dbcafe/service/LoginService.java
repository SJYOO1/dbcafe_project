package kr.co.dbcafe.service;

import kr.co.dbcafe.vo.LoginReqDTO;
import kr.co.dbcafe.vo.StoreDTO;

public interface LoginService {

	boolean findById(LoginReqDTO loginReqDTO);
	
	StoreDTO findStNm(String id); 
}
