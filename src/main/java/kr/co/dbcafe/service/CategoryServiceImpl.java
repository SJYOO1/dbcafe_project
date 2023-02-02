package kr.co.dbcafe.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.CategoryDAO;
import kr.co.dbcafe.vo.CategoryDTO;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;

	// 카테고리별 매출 조회
	@Override
	public List<CategoryDTO> categorySum(Map<String, Object> map) {
		List<CategoryDTO> list = null;
		try {
			list = categoryDAO.categorySum(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	// 카테고리별 판매량 조회
	@Override
	public List<CategoryDTO> categoryCount(Map<String, Object> map) {
		List<CategoryDTO> list = null;
		try {
			list = categoryDAO.categoryCount(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}	
}
