package kr.co.dbcafe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.CategoryService;
import kr.co.dbcafe.vo.CategoryDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CategoryRestController {

	@Autowired
	private CategoryService categoryService ;
	
	// 폼에서 넘어온 값을 받는다.
	// 카테고리별 매출
	@GetMapping("/category")
	public List<CategoryDTO> categorySelectSum(@RequestParam(value="startDay") String s,
											   @RequestParam(value="endDay" ) String e,
											   HttpSession session
											   ){
		String stNo = (String)session.getAttribute("stNo");
		Map<String, Object> map = new HashMap<>();
		map.put("startDay", s);
		map.put("endDay", e);
		map.put("stNo", stNo);
		log.info(stNo);
		List<CategoryDTO> list = categoryService.categorySum(map);
		return list;
	}
}
