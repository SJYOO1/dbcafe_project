package kr.co.dbcafe.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuYnUpdateReqDTO {
	private String stNo;
	private String gdYn;
	private String gdNo;
}
