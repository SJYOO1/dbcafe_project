package kr.co.dbcafe.dao;

import java.sql.SQLException;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.MonthGoalResultDTO;
import kr.co.dbcafe.vo.YearGoalResultDTO;

@Mapper
public interface SalesGoalDAO {
	MonthGoalResultDTO selectMonthSalesGoal(Map<String, Object> map) throws SQLException;

	YearGoalResultDTO selectYearSalesGoal(Map<String, Object> map) throws SQLException;
}
