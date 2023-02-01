package kr.co.dbcafe.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.SalesGoalDAO;
import kr.co.dbcafe.vo.MonthGoalResultDTO;

@Service("salesGoalService")
public class SalesGoalServiceImpl implements SalesGoalService {

	@Autowired
	private SalesGoalDAO salesGoalDAO;

	@Override
	public MonthGoalResultDTO selectMonthSalesGoal() {
		MonthGoalResultDTO resultDTO = new MonthGoalResultDTO();
		try {
			resultDTO = salesGoalDAO.selectMonthSalesGoal();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDTO;
	}
}
