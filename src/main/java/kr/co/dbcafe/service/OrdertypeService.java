package kr.co.dbcafe.service;

import java.util.List;
import java.util.Map;

import kr.co.dbcafe.vo.OrdertypeDTO;

public interface OrdertypeService {
	List<OrdertypeDTO> ordertypeSelect(Map<String, Object>map);
	String today();
}
