package kr.co.dbcafe.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.CategoryDAO;
import kr.co.dbcafe.vo.CategoryVO;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	// 1. 일별 조회  
	@Override
	public Map<String, Object> categoryDay(Map<String, Object> map) {
		Map<String, Object> map2 = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map2;
	}

	@Override
	public Map<String, Object> categoryWeek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> categoryMonth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> categoryYear() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryVO> list() {
		List<CategoryVO> list = null;
		try {
			list = categoryDAO.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Map<String, Object> selectOrd(String startDate, String endDate) {
		Map<String, Object> map = new HashMap<>();
		try {
			map.put("startDate",startDate );
			map.put("endDate",endDate );
			categoryDAO.selectOrd(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	
}
