package com.xworkz.grocery.repository;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.grocery.entity.GroceryEntity;

@Repository
public class GroceryRepositoryImpl implements GroceryRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public GroceryRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(GroceryEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(entity);
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

	}

	@Override
	public GroceryEntity findByName(String name) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			return (GroceryEntity) query.getSingleResult();

		} finally {
			manager.close();
		}
	}

	public GroceryEntity upadteByName(GroceryEntity entity) {
		System.out.println("invoked update repo");

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			manager.getTransaction().begin();
			Query query = manager.createNamedQuery("upadteByName");
			query.setParameter("nm", entity.getName());
			query.setParameter("qty", entity.getQuantity());
			query.setParameter("ps", entity.getPrice());
			query.setParameter("ty", entity.getType());
			query.setParameter("bnd", entity.getBrand());

			Object obj = query.executeUpdate();
			transaction.commit();

		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return GroceryRepository.super.upadteByName(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GroceryEntity> getAll() {
		System.out.println("Invoked getAll()");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("getAll");

			return (List<GroceryEntity>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;

	}

	@Override
	public boolean deleteByName(String name) {
		System.out.println("Invoked deleteGroceryByName()");
		EntityManager manager = this.entityManagerFactory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		try {
			manager.getTransaction().begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("nm", name);

			query.executeUpdate();
			transaction.commit();

		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}

		}
		return false;
	}
}
