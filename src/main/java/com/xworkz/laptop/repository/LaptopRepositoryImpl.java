package com.xworkz.laptop.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class LaptopRepositoryImpl implements LaptopRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public LaptopRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public boolean saveLaptopEntity(Object obj) {
		System.out.println("invoked saveLaptop()");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(obj);
			transaction.commit();

		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			if (manager != null) {
				System.out.println("Data saved");
				manager.close();
			} else {
				System.out.println("Data not saved");

			}

		}
		return false;

	}

}
