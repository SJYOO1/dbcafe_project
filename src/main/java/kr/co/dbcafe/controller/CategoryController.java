package kr.co.dbcafe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.dbcafe.service.CategoryService;
import kr.co.dbcafe.vo.CategoryDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService ;
	
//	@GetMapping(value = "/index")
//	public String Test(Model model) {
//		List<CategoryVO> list = categoryService.list();
//		model.addAttribute("list",list);
//		return "index"; 
//	}
	
	// 폼을 띄운다.
	@GetMapping(value = "/date")
	public String categoryDate() {
			
		return "date";
	}
	// 폼에서 넘어온 값을 받는다.
	// 카테고리별 매출
	@GetMapping("/sales")
	public String categorySelectSum(@RequestParam(defaultValue = "2020-03-01") String s,
									@RequestParam(defaultValue = "2020-03-10") String e,
									Model model ){
		Map<String, Object> map = new HashMap<>();
		map.put("startDay", s);
		map.put("endDay", e);
		List<CategoryDTO> list = categoryService.categorySum(map);
		
		model.addAttribute("list", list);
		return "sales";
	}
	// 카테고리별 판매량
	@GetMapping("/count")
	public String CategorySelectCount(@RequestParam(defaultValue = "2020-03-01") String s,
									  @RequestParam(defaultValue = "2020-03-10") String e,
									  Model model ){
		Map<String, Object> map = new HashMap<>();
		map.put("startDay", s);
		map.put("endDay", e);
		List<CategoryDTO> list = categoryService.categoryCount(map);
		model.addAttribute("list", list);
		return "count";
	}
	
	
//	@PostMapping("/salesOk")
//	public String  view(@RequestParam Map<String, String> map, Model model){
//		model.addAttribute("map", map);
//		model.addAttribute("aaa",categoryService.selectOrd(map.get("startDay"), map.get("EndDay"))) ;
//		return "category_view";
//	}
	
}
