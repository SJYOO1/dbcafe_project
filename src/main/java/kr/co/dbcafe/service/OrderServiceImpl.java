package kr.co.dbcafe.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.OrderDAO;
import kr.co.dbcafe.vo.PeriodResultDTO;

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
}
