package kr.co.dbcafe.service;

import java.util.List;
import java.util.Map;

import kr.co.dbcafe.vo.PaymentDTO;

public interface PaymentService {
	List<PaymentDTO> paymentSelect(Map<String, Object> map);
	String today();
}
