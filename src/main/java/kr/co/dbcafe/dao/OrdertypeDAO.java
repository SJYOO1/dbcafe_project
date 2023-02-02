package kr.co.dbcafe.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.OrdertypeDTO;

@Mapper
public interface OrdertypeDAO {
	List<OrdertypeDTO> ordertypeSelect(Map<String, Object> map) throws Exception;
	String today() throws SQLException;
}