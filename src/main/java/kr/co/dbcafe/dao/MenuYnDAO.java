package kr.co.dbcafe.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.MenuYnResDTO;
import kr.co.dbcafe.vo.MenuYnUpdateReqDTO;

@Mapper
public interface MenuYnDAO {

	// 전체조회
	List<MenuYnResDTO> menuList(String stNo) throws SQLException;
	
	// 사용 여부 수정
	void updateMenuYn(MenuYnUpdateReqDTO menuYnUpdateReqDTO) throws SQLException;

}
