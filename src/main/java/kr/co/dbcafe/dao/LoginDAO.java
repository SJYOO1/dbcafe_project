package kr.co.dbcafe.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dbcafe.vo.AccountDTO;
import kr.co.dbcafe.vo.StoreDTO;

@Mapper
public interface LoginDAO {
	// 계정 정보 조회
	AccountDTO findById(String id) throws SQLException;
	
	// 지점 정보 조회
	StoreDTO findStNm(String id) throws SQLException;
	
}