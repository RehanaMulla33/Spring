package com.xworkz.ipl.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.ipl.entity.IplEntity;

public class IplRepositoryImpl implements IplRepository {
	private EntityManagerFactory entityManagerFactory;

	public IplRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(IplEntity entity) {
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
