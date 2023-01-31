package kr.co.dbcafe.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.PeriodCompResultDTO;
import kr.co.dbcafe.vo.PeriodResultDTO;

@Mapper
public interface OrderDAO {
	List<PeriodResultDTO> selectByUnitTime(Map<String, Object> map) throws SQLException;

	List<PeriodResultDTO> selectByUnitDate(Map<String, Object> map) throws SQLException;

	List<PeriodCompResultDTO> selectCompByStore(Map<String, Object> map) throws SQLException;
}
