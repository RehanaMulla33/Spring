package com.xworkz.passport.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.passport.entity.PassportEntity;

public class PassportRepositoryImpl implements PassportRepository {

	@Override
	public void save(PassportEntity entity) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (manager != null) {
				manager.close();
			}

		}

	}

}
