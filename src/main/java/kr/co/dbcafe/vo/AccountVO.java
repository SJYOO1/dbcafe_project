package kr.co.dbcafe.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountVO {
	private String id;
	private String password;
	private String stNo;
}
