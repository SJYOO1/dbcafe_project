package kr.co.dbcafe.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class YgoalVO {
	private Date goalYy;
	private int yearGoalSales;
	private String stNo;
}
