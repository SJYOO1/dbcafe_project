package kr.co.dbcafe.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.OrderService;
import kr.co.dbcafe.vo.PeriodResultDTO;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/utime")
	public List<PeriodResultDTO> viewByUnitTime(@RequestParam(defaultValue = "2020-03-01") String s,
			@RequestParam(defaultValue = "2020-03-10") String e, @RequestParam(defaultValue = "1001") List<String> st) {
		List<PeriodResultDTO> dtos = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("start", s);
		map.put("end", e);
		map.put("stNoList", st);
		dtos = orderService.selectByUnitTime(map);
		return dtos;
	}

	@GetMapping("/udate")
	public List<PeriodResultDTO> viewByUnitDate(@RequestParam(defaultValue = "2020-03-01") String s,
			@RequestParam(defaultValue = "2020-03-10") String e, @RequestParam(defaultValue = "1001") List<String> st) {
		List<PeriodResultDTO> dtos = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("start", s);
		map.put("end", e);
		map.put("stNoList", st);
		dtos = orderService.selectByUnitDate(map);
		return dtos;
	}
}
