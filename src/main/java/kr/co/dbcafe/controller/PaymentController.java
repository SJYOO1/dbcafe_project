package kr.co.dbcafe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dbcafe.service.PaymentService;
import kr.co.dbcafe.vo.PaymentDTO;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@GetMapping("/today")
	public String today() {
		String today = paymentService.today();
		return today;
	}
	
	@GetMapping("/payment")
	public List<PaymentDTO> payment(@RequestParam(defaultValue = "1001") String st,@RequestParam(defaultValue = "2020-03-01") String s,@RequestParam(defaultValue = "2020-03-02") String e){
		Map<String, Object> map = new HashMap<>();
		map.put("storeNum", st);
		map.put("startDay", s);
		map.put("endDay", e);
		List<PaymentDTO> payment = paymentService.paymentSelect(map);
		return payment;
	}
}
