package com.xworkz.newspaper.repository;

import com.xworkz.newspaper.entity.NewsPaperEntity;

public interface NewPaperRepository {
	public void insert(NewsPaperEntity entity);

	public void updateNewsPaperEntity(int nId, String language);

	public void deleteNewsPaperById(int nId);

	public void readNewsPaperEntity(int nId);

//	void readAllNewsPaperEntity();

}
