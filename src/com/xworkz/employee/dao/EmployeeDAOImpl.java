package com.xworkz.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import com.xworkz.employee.entity.EmployeeEntity;
@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManagerFactory entityManagerFactory;

	public EmployeeDAOImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public void fetchId() {
		EntityManagerFactory emf = (EntityManagerFactory) entityManagerFactory.createEntityManager();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.getTransaction().begin();

		try {

			CriteriaBuilder cb = manager.getCriteriaBuilder();
			CriteriaQuery<EmployeeEntity> cq = cb.createQuery(EmployeeEntity.class);

			Root<EmployeeEntity> emp = cq.from(EmployeeEntity.class);

			cq.select(emp.get("e_Name"));

			CriteriaQuery<EmployeeEntity> select = cq.select(emp);
			TypedQuery<EmployeeEntity> q = manager.createQuery(select);
			List<EmployeeEntity> list = q.getResultList();

			System.out.println("e_Id");

			for (EmployeeEntity s : list) {
				System.out.println(s.getE_Id());

			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		transaction.commit();
		manager.close();
		emf.close();

	}

	@Override
	public void fetchMultiFecth() {
		EntityManagerFactory emf = (EntityManagerFactory) entityManagerFactory.createEntityManager();

		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<EmployeeEntity> cq = cb.createQuery(EmployeeEntity.class);

		Root<EmployeeEntity> emp = cq.from(EmployeeEntity.class);

		cq.multiselect(emp.get("e_Id"), emp.get("e_Name"), emp.get("e_Salary"));
		CriteriaQuery<EmployeeEntity> select = cq.select(emp);
		TypedQuery<EmployeeEntity> q = manager.createQuery(select);
		List<EmployeeEntity> list = q.getResultList();

		System.out.print("e_Id");
		System.out.print("\t e_Name");
		System.out.println("\t e_Salary");

		for (EmployeeEntity e : list) {
			System.out.print(e.getE_Id());
			System.out.print("\t" + e.getE_Name());
			System.out.println("\t" + e.getE_Salary());
		}

		manager.getTransaction().commit();
		manager.close();
		emf.close();

	}

	public void fetchAll() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.getTransaction().begin();

		try {
			CriteriaBuilder cb = manager.getCriteriaBuilder();
			CriteriaQuery<EmployeeEntity> cr = cb.createQuery(EmployeeEntity.class);
			Root<EmployeeEntity> root = cr.from(EmployeeEntity.class);
			cr.select(root);

			Query query = ((EntityManager) manager).createQuery(cr);
			List<EmployeeEntity> results = query.getResultList();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		manager.getTransaction().commit();

		manager.close();
	}

	public void fetchOrderBy() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.getTransaction().begin();
		try {
			CriteriaBuilder cb = manager.getCriteriaBuilder();
			CriteriaQuery<EmployeeEntity> cq = cb.createQuery(EmployeeEntity.class);

			Root<EmployeeEntity> emp = cq.from(EmployeeEntity.class);

			cq.orderBy(cb.asc(emp.get("e_Name")));
			CriteriaQuery<EmployeeEntity> select = cq.select(emp);
			TypedQuery<EmployeeEntity> q = manager.createQuery(select);
			List<EmployeeEntity> list = q.getResultList();

			System.out.print("e_Id");
			System.out.print("\t e_Salary");
			System.out.println("\t e_Name");

			for (EmployeeEntity e : list) {
				System.out.print(e.getE_Id());
				System.out.print("\t" + e.getE_Salary());
				System.out.println("\t" + e.getE_Name());
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		manager.getTransaction().commit();

		manager.close();

	}

	public void updatePlace() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.getTransaction().begin();
		try {
			Query query = manager.createQuery("update EmployeeEntity SET e_Place='Aurangabad' where e_Id=3");
			query.executeUpdate();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		manager.getTransaction().commit();

		manager.close();

	}

}
