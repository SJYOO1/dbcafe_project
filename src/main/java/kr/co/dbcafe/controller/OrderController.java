package kr.co.dbcafe.controller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.OrderService;
import kr.co.dbcafe.vo.PeriodCompResultDTO;
import kr.co.dbcafe.vo.OrderResultVO;

@RestController
@RequestMapping(value = "/period")
public class OrderController {

	@Autowired
	private OrderService orderService;

	// 시간대별 조회
	@GetMapping("/utime")
	public List<OrderResultVO> selectSalesByTime(@RequestParam("s") String s, @RequestParam("e") String e,
			@RequestParam(value = "st[]") List<String> st) {
		List<OrderResultVO> stNm = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("start", s);
		map.put("end", e);
		stNm = orderService.selectSalesByTime(st, map);
		return stNm;
	}

	// 날짜별 조회
	@GetMapping("/udate")
	public List<OrderResultVO> selectSalesByDate(@RequestParam("s") String s, @RequestParam("e") String e,
			@RequestParam(value = "st") List<String> st) {
		List<OrderResultVO> stNm = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("start", s);
		map.put("end", e);
		stNm = orderService.selectSalesByDate(st, map);
		return stNm;
	}

	// 비교조회
	@GetMapping("/comp")
	public List<PeriodCompResultDTO> viewByComp(@RequestParam(defaultValue = "2020-03-01") String s1,
			@RequestParam(defaultValue = "2020-03-05") String e1, @RequestParam(defaultValue = "2020-03-06") String s2,
			@RequestParam(defaultValue = "2020-03-10") String e2,
			@RequestParam(defaultValue = "1001") List<String> st) {
		List<PeriodCompResultDTO> dtos1 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("start1", s1);
		map.put("end1", e1);
		map.put("start2", s2);
		map.put("end2", e2);
		map.put("stNoList", st);
		dtos1 = orderService.selectCompByStore(map);
		return dtos1;
	}

}
