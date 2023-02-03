package kr.co.dbcafe.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.CategoryDTO;

@Mapper
public interface CategoryDAO {
	// 카테고리별 매출
	List<CategoryDTO> categorySum(Map<String, Object> map) throws SQLException;
}
