package kr.co.dbcafe.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.PaymentDTO;

@Mapper
public interface PaymentDAO {
	List<PaymentDTO> paymentSelect(Map<String, Object> map) throws Exception;
	String today() throws SQLException;
}
