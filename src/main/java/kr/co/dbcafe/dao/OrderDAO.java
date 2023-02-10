package kr.co.dbcafe.dao;

import java.sql.SQLException;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.OrderResultVO.SumByTime;

@Mapper
public interface OrderDAO {

	String selectStNm(String stNo) throws SQLException;

	List<SumByTime> sumByUnitTimes(Map<String, Object> map) throws SQLException;
	
	List<SumByTime> sumByUnitDate(Map<String, Object> map) throws SQLException;
}
