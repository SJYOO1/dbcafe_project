package kr.co.dbcafe.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.dbcafe.service.CategoryService;
import kr.co.dbcafe.vo.CategoryVO;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService ;
	
	@GetMapping(value = "/index")
	public String Test(Model model) {
		List<CategoryVO> list = categoryService.list();
		model.addAttribute("list",list);
		return "index"; 
	}
	
	// 폼을 띄운다.
	@GetMapping(value = "/sales")
	public String categorySales() {
			
		return "category_sales";
	}
	// 폼에서 넘어온 값을 받는다.
	@PostMapping("/salesOk")
	public String  view(@RequestParam Map<String, String> map, Model model){
		model.addAttribute("map", map);
		model.addAttribute("aaa",categoryService.selectOrd(map.get("startDay"), map.get("EndDay"))) ;
		return "category_view";
	}
	
	@GetMapping(value = "/count")
	public String CategoryCount(Model model, @RequestParam Map<String, Object> param) {
		
		return "category_count";
	}
}
