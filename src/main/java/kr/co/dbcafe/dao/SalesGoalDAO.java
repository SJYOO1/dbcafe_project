package kr.co.dbcafe.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.MonthGoalResultDTO;

@Mapper
public interface SalesGoalDAO {
	MonthGoalResultDTO selectMonthSalesGoal() throws SQLException;
}
