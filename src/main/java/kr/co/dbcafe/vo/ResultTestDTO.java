package kr.co.dbcafe.vo;

import java.util.List;

import lombok.Data;

@Data
public class ResultTestDTO {

	private String stNm;
	private List<sumByTime> sumByTimes;

	@Data
	public class sumByTime {
		private String time;
		private int sum;
	}
}
