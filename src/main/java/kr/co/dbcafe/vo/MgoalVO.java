package kr.co.dbcafe.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MgoalVO {
	private Date goalYm;
	private int monthGoalSales;
	private String stNo;
}
