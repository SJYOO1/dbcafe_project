package kr.co.dbcafe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.OrdertypeService;
import kr.co.dbcafe.vo.OrdertypeDTO;

@RestController
public class OrdertypeController {

	@Autowired
	OrdertypeService ordertypeService;
	
	@GetMapping("/")
	public String today() {
		String today = ordertypeService.today();
		return today;
	}
	
	@GetMapping("/order")
	public List<OrdertypeDTO> ordertype(@RequestParam(defaultValue = "1001") String st,@RequestParam(defaultValue = "2020-03-01") String s,@RequestParam(defaultValue = "2020-03-02") String e){
		Map<String, Object> map = new HashMap<>();
		map.put("storeNum", st);
		map.put("startDay", s);
		map.put("endDay", e);
		List<OrdertypeDTO> ordertype = ordertypeService.ordertypeSelect(map);
		return ordertype;
	}
}
