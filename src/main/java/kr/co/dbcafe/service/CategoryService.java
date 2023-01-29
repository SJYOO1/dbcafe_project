package kr.co.dbcafe.service;

import java.util.List;
import java.util.Map;

import kr.co.dbcafe.vo.CategoryVO;

public interface CategoryService {
	// 1. 일별 조회
	Map<String, Object> categoryDay(Map<String, Object> map);
	// 2. 주별 조회
	Map<String, Object> categoryWeek();
	// 3. 월별 조회
	Map<String, Object> categoryMonth();
	// 4. 년도별 조회
	Map<String, Object> categoryYear();
	
	List<CategoryVO> list();
	
	Map<String, Object> selectOrd(String startDate, String endDate);
}
