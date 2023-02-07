package kr.co.dbcafe.service;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.SalesGoalDAO;
import kr.co.dbcafe.vo.MonthGoalResultDTO;
import kr.co.dbcafe.vo.YearGoalResultDTO;

@Service("salesGoalService")
public class SalesGoalServiceImpl implements SalesGoalService {

	@Autowired
	private SalesGoalDAO salesGoalDAO;

	@Override
	public MonthGoalResultDTO selectMonthSalesGoal(Map<String, Object> map) {
		MonthGoalResultDTO resultDTO = new MonthGoalResultDTO();
		try {
			resultDTO = salesGoalDAO.selectMonthSalesGoal(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDTO;
	}

	@Override
	public YearGoalResultDTO selectYearSalesGoal(Map<String, Object> map) {
		YearGoalResultDTO resultDTO = new YearGoalResultDTO();
		try {
			resultDTO = salesGoalDAO.selectYearSalesGoal(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDTO;
	}
}
