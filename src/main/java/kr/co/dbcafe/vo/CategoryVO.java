package kr.co.dbcafe.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryVO {
	private String catNo;
	private String catNm;
	private char catYn;
}
