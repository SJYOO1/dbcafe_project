package kr.co.dbcafe.service;

import java.util.List;


import java.util.Map;

import kr.co.dbcafe.vo.OrderResultVO;

public interface OrderService {

	List<OrderResultVO> selectSalesByTime(List<String> stNo, Map<String, Object> map);

	List<OrderResultVO> selectSalesByDate(List<String> stNo, Map<String, Object> map);
}
