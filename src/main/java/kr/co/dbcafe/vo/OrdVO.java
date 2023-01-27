package kr.co.dbcafe.vo;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class OrdVO {
	private int ordNo;
	private String stNo;
	private Date ordDt;
	private char typeNo;
	private char payNo;
	private List<DetailVO> detailVOs;

	@Data
	public static class DetailVO {
		private int detailNo;
		private int ordNo;
		private String gdNo;
		private int ordQn;
		private int totPrice;
	}
}
