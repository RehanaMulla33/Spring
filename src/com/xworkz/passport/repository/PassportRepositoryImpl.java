package com.xworkz.passport.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.hibernate.engine.spi.EntityEntryFactory;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.passport.entity.PassportEntity;

public class PassportRepositoryImpl implements PassportRepository {
	private EntityManagerFactory entityManagerFactory;

	public PassportRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}


	@Override
	public void save(PassportEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
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
