package kr.co.dbcafe.service;

import java.util.List;

import kr.co.dbcafe.vo.MenuYnResDTO;
import kr.co.dbcafe.vo.MenuYnUpdateReqDTO;

public interface MenuYnService {

	// 전체조회
	List<MenuYnResDTO> menuList(String stNo);
	
	// 사용 여부 수정
	void updateMenuYn(String stNo, MenuYnUpdateReqDTO menuYnUpdateReqDTO);
}
