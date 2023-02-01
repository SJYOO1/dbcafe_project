package kr.co.dbcafe.service;

import java.util.List;
import java.util.Map;

import kr.co.dbcafe.vo.CategoryDTO;
import kr.co.dbcafe.vo.CategoryVO;

public interface CategoryService {
	// 1. 카테고리별 매출 조회
	List<CategoryDTO> categorySum(Map<String, Object> map);
	// 2. 카테고리별 판매량 조회
	List<CategoryDTO> categoryCount(Map<String, Object> map);
	
//	List<CategoryVO> list();
//	
//	Map<String, Object> selectOrd(String startDate, String endDate);
}
