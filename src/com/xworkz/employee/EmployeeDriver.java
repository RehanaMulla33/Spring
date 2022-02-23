package com.xworkz.employee;

import com.xworkz.employee.dao.EmployeeDAO;
import com.xworkz.employee.dao.EmployeeDAOImpl;
import com.xworkz.employee.entity.EmployeeEntity;

public class EmployeeDriver {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();


		//EmployeeEntity dao = new EmployeeEntity(null, null, 0, null, null, null, null, null, null);
	
		// dao.getByNameAndId(20000,"Shreya");
		//dao.fetchId();
		//dao.fetchMultiFecth();
		//dao.fetchAll();
		//dao.fetchOrderBy();
		//dao.updatePlace();
		//dao.fetchSalaryBtn();
		

	}

}
