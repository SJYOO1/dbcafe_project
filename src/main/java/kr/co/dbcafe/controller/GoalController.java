package kr.co.dbcafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.SalesGoalService;
import kr.co.dbcafe.vo.MonthGoalResultDTO;

@RestController
public class GoalController {

	@Autowired
	private SalesGoalService salesGoalService;

	@GetMapping("/month")
	public MonthGoalResultDTO monthGoal() {
		MonthGoalResultDTO resultDTO = salesGoalService.selectMonthSalesGoal();
		return resultDTO;
	}
}
