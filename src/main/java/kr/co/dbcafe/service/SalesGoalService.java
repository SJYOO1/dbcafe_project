package kr.co.dbcafe.service;

import java.util.Map;

import kr.co.dbcafe.vo.MonthGoalResultDTO;
import kr.co.dbcafe.vo.YearGoalResultDTO;

public interface SalesGoalService {
	MonthGoalResultDTO selectMonthSalesGoal(Map<String, Object> map);

	YearGoalResultDTO selectYearSalesGoal(Map<String, Object> map);
}
