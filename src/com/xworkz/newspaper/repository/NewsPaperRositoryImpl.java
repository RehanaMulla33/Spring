package com.xworkz.newspaper.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import com.xworkz.newspaper.entity.NewsPaperEntity;

public class NewsPaperRositoryImpl implements NewPaperRepository {
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insert(NewsPaperEntity entity) {
		String sql = "Insert into NewsPaperEntity"
				+ "(n_id,n_name,n_language,n_cost,n_publishedDate,n_numOfPages)values(?,?,?,?,?)";

		jdbcTemplate.update(sql, new Object[] { entity.getNId(), entity.getNewsPaperName(), entity.getLanguage(),
				entity.getCost(), entity.getPublishedDate(), entity.getNumOfPages() });

	}

	@Override
	public void updateNewsPaperEntity(int nId, String language) {
		String sql = "update NewsPaperEntity set n_language=? where id=?";
		jdbcTemplate.update(sql, nId, language);

	}

	@Override
	public void deleteNewsPaperById(int nId) {
		String sql = "Delete from NewsPaperEntity where n_id=?";
		jdbcTemplate.update(sql, nId);
	}

	@Override
	public void readNewsPaperEntity(int nId) {
		String sql = "select *from NewsPaperEntity where n_id=?";
		jdbcTemplate.queryForObject(sql, new Object[] { nId }, new NewsPaperMapper());

	}

}
