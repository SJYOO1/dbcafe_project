package kr.co.dbcafe.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.PeriodCompResultDTO;
import kr.co.dbcafe.vo.PeriodResultDTO;
import kr.co.dbcafe.vo.OrderResultVO.SumByTime;

@Mapper
public interface OrderDAO {
	List<PeriodResultDTO> selectByUnitTime(Map<String, Object> map) throws SQLException;

	List<PeriodResultDTO> selectByUnitDate(Map<String, Object> map) throws SQLException;

	List<PeriodCompResultDTO> selectCompByStore(Map<String, Object> map) throws SQLException;

	// Test용 DAO 시작
	String selectStNm(String stNo) throws SQLException;

	List<SumByTime> sumByUnitTimes(Map<String, Object> map) throws SQLException;
	
	List<SumByTime> sumByUnitDate(Map<String, Object> map) throws SQLException;
	// Test용 DAO 종료
}
