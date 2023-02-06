package kr.co.dbcafe.service;

import java.util.List;
import java.util.Map;

import kr.co.dbcafe.vo.PeriodCompResultDTO;
import kr.co.dbcafe.vo.PeriodResultDTO;
import kr.co.dbcafe.vo.OrderResultVO;

public interface OrderService {
	List<PeriodResultDTO> selectByUnitTime(Map<String, Object> map);

	List<PeriodResultDTO> selectByUnitDate(Map<String, Object> map);

	List<PeriodCompResultDTO> selectCompByStore(Map<String, Object> map);

	// Test용 DAO 시작
	List<OrderResultVO> selectSalesByTime(List<String> stNo, Map<String, Object> map);

	List<OrderResultVO> selectSalesByDate(List<String> stNo, Map<String, Object> map);
	// Test용 DAO 종료
}
