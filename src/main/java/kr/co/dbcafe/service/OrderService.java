package kr.co.dbcafe.service;

import java.util.List;
import java.util.Map;

import kr.co.dbcafe.vo.PeriodCompResultDTO;
import kr.co.dbcafe.vo.PeriodResultDTO;

public interface OrderService {
	List<PeriodResultDTO> selectByUnitTime(Map<String, Object> map);

	List<PeriodResultDTO> selectByUnitDate(Map<String, Object> map);

	List<PeriodCompResultDTO> selectCompByStore(Map<String, Object> map);
}
