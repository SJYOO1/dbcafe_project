package kr.co.dbcafe.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderTypeVO {
	private char typeNo;
	private String typeNm;
}
