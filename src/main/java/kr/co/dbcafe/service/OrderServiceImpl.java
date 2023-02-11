package kr.co.dbcafe.service;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dbcafe.dao.OrderDAO;
import kr.co.dbcafe.vo.OrderResultVO;
import kr.co.dbcafe.vo.OrderResultVO.SumByTime;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	@Override
	public List<OrderResultVO> selectSalesByTime(List<String> stNo, Map<String, Object> map) {
		List<OrderResultVO> stNm = new ArrayList<>();
		try {
			for (int i = 0; i < stNo.size(); i++) {
				OrderResultVO dto = new OrderResultVO();
				List<SumByTime> sumByTimes = new ArrayList<>();
				dto.setStNm(orderDAO.selectStNm(stNo.get(i)));
				map.put("stNo", stNo.get(i));
				sumByTimes = orderDAO.sumByUnitTimes(map);
				if (sumByTimes.size() != 12) {
					String[] times = { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
					for (int j = 0; j < sumByTimes.size(); j++) {
						sumByTimes.get(j).setTime(times[j]);
						sumByTimes.get(j).setSum(0);
					}
					for (int j = sumByTimes.size(); j < times.length; j++) {
						SumByTime sumByTime = new SumByTime(times[j], 0);
						sumByTimes.add(sumByTime);
					}
					List<SumByTime> newSumByTimes = new ArrayList<>();
					newSumByTimes = orderDAO.sumByUnitTimes(map);
					for (int j = 0; j < sumByTimes.size(); j++) {
						;
						for (int k = 0; k < newSumByTimes.size(); k++) {
							if (sumByTimes.get(j).getTime().equals(newSumByTimes.get(k).getTime())) {
								sumByTimes.get(j).setSum(newSumByTimes.get(k).getSum());
							}
						}
					}

					dto.setSumByTimes(sumByTimes);
				} else {
					dto.setSumByTimes(sumByTimes);
				}
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