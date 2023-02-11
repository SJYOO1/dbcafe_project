package kr.co.dbcafe.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResultVO {

	private String stNm;
	private List<SumByTime> sumByTimes;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SumByTime {
		private String time;
		private int sum;
	}
}
