package kr.co.dbcafe.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.OrdertypeDAO;
import kr.co.dbcafe.vo.OrdertypeDTO;

@Service("ordertypeService")
public class OrdertypeServiceImpl implements OrdertypeService{

	@Autowired
	OrdertypeDAO ordertypeDAO;
	
	@Override
	public List<OrdertypeDTO> ordertypeSelect(Map<String, Object>map) {
		List<OrdertypeDTO> list = new ArrayList<>();
		
		try {
			list = ordertypeDAO.ordertypeSelect(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public String today() {
		String day ="";
		try {
			day = ordertypeDAO.today();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return day;
	}
	
	
}
