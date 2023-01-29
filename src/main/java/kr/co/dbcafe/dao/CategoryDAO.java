package kr.co.dbcafe.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.CategoryVO;

@Mapper
public interface CategoryDAO {
	Map<String, String> categorySelect(Map<String, Object> map) throws SQLException;
	Map<String, String> menuSelect(Map<String, Object> map) throws SQLException;
	List<CategoryVO> selectAll() throws SQLException;
	Map<String, Object> selectOrd(Map<String, Object> map) throws SQLException;
}
