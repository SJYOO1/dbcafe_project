package kr.co.dbcafe.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.PaymentDAO;
import kr.co.dbcafe.vo.PaymentDTO;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentDAO paymentDAO;

	@Override
	public List<PaymentDTO> paymentSelect(Map<String, Object> map) {
		List<PaymentDTO> list = new ArrayList<>();

		try {
			list = paymentDAO.paymentSelect(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String today() {
		String day ="";
		try {
			day = paymentDAO.today();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return day;
	}

}
