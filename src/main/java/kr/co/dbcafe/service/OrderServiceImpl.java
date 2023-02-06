package kr.co.dbcafe.service;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.OrderDAO;
import kr.co.dbcafe.vo.PeriodCompResultDTO;
import kr.co.dbcafe.vo.PeriodResultDTO;
import kr.co.dbcafe.vo.OrderResultVO;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	@Override
	public List<PeriodResultDTO> selectByUnitTime(Map<String, Object> map) {
		List<PeriodResultDTO> dtos = new ArrayList<>();
		try {
			dtos = orderDAO.selectByUnitTime(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}

	@Override
	public List<PeriodResultDTO> selectByUnitDate(Map<String, Object> map) {
		List<PeriodResultDTO> dtos = new ArrayList<>();
		try {
			dtos = orderDAO.selectByUnitDate(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}

	@Override
	public List<PeriodCompResultDTO> selectCompByStore(Map<String, Object> map) {
		List<PeriodCompResultDTO> dtos = new ArrayList<>();
		try {
			dtos = orderDAO.selectCompByStore(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}

	// Test용 Service 시작
	@Override
	public List<OrderResultVO> selectSalesByTime(List<String> stNo, Map<String, Object> map) {
		List<OrderResultVO> stNm = new ArrayList<>();
		try {
			for (int i = 0; i < stNo.size(); i++) {
				OrderResultVO dto = new OrderResultVO();
				dto.setStNm(orderDAO.selectStNm(stNo.get(i)));
				map.put("stNo", stNo.get(i));
				dto.setSumByTimes(orderDAO.sumByUnitTimes(map));
				stNm.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stNm;
	}
	@Override
	public List<OrderResultVO> selectSalesByDate(List<String> stNo, Map<String, Object> map) {
		List<OrderResultVO> stNm = new ArrayList<>();
		try {
			for (int i = 0; i < stNo.size(); i++) {
				OrderResultVO dto = new OrderResultVO();
				dto.setStNm(orderDAO.selectStNm(stNo.get(i)));
				map.put("stNo", stNo.get(i));
				dto.setSumByTimes(orderDAO.sumByUnitDate(map));
				stNm.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stNm;
	}
	// Test용 Service 종료
}