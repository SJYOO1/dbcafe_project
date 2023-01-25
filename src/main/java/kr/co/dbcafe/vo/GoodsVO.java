package kr.co.dbcafe.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsVO {
	private String gdNo;
	private String gdNm;
	private int price;
	private String catNo;
	private char gdYn;
}
