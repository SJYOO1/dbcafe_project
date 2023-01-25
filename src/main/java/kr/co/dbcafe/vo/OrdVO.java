package kr.co.dbcafe.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdVO {
	private int ordNo;
	private String stNo;
	private Date ordDt;
	private char typeNo;
	private char payNo;
	
	class DetailVO {
		private int detailNo;
		private int ordNo;
		private String gdNo;
		private int ordQn;
		private int toPrice;
	}
}
