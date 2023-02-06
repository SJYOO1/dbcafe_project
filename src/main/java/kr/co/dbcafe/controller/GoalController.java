package kr.co.dbcafe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.SalesGoalService;
import kr.co.dbcafe.vo.MonthGoalResultDTO;
import kr.co.dbcafe.vo.YearGoalResultDTO;

@RestController
public class GoalController {

	@Autowired
	private SalesGoalService salesGoalService;

	@GetMapping("/month")
	public MonthGoalResultDTO monthGoal(@RequestParam(value="currentYm") String s
										) {
		Map<String, Object> map = new HashMap<>();
		map.put("currentYm", s);
		map.put("accountStNo", "1001");
		MonthGoalResultDTO resultDTO = salesGoalService.selectMonthSalesGoal(map);
		return resultDTO;
	}

	@GetMapping("/year")
	public YearGoalResultDTO yearGoal(@RequestParam(value="currentYy") String s
									) {
		Map<String, Object> map = new HashMap<>();
		map.put("currentYy", s);
		map.put("accountStNo", "1001");
		YearGoalResultDTO resultDTO = salesGoalService.selectYearSalesGoal(map);
		return resultDTO;
	}
}
