package com.xworkz.newspaper.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.xworkz.newspaper.entity.NewsPaperEntity;

public class NewsPaperMapper implements RowMapper<NewsPaperEntity> {


	@Override
	public NewsPaperEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		NewsPaperEntity entity=new NewsPaperEntity(null, null, rowNum, null, rowNum);
		entity.setNewsPaperName(rs.getString(2));
		entity.setLanguage(rs.getString(3));
		entity.setCost(rs.getDouble(4));
		entity.setPublishedDate(rs.getDate(5));
		entity.setNumOfPages(rs.getInt(6));
		return null;
	}

}
