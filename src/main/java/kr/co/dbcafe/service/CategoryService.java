package kr.co.dbcafe.service;

import java.util.List;
import java.util.Map;

import kr.co.dbcafe.vo.CategoryDTO;

public interface CategoryService {
	// 카테고리별 조회
	List<CategoryDTO> categorySum(Map<String, Object> map);
}
