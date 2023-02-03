package kr.co.dbcafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import kr.co.dbcafe.dao.MenuYnDAO;
import kr.co.dbcafe.vo.MenuYnResDTO;
import kr.co.dbcafe.vo.MenuYnUpdateReqDTO;

@Service
public class MenuYnServiceImpl implements MenuYnService {

	@Autowired
	private MenuYnDAO menuYnDAO;
	
	@Override
	public List<MenuYnResDTO> menuList(String stNo) {
		List<MenuYnResDTO> menulist = null;
		try {
			menulist = menuYnDAO.menuList(stNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menulist;
	}

	@Override
	public void updateMenuYn(@RequestBody MenuYnUpdateReqDTO menuYnUpdateReqDTO) {
		try {
			menuYnDAO.updateMenuYn(menuYnUpdateReqDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
