package com.xworkz.ipl;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.ipl.entity.IplEntity;
import com.xworkz.ipl.service.IplService;

public class IPLTester {

	public static void main(String[] args) {
		//IplEntity entity= new IplEntity("Royal Challengers", "KingFisher", "Krishna Murari", "RehanaBegam Mulla", LocalDate.of(1998, 01, 04), 50000000L);
		IplEntity entity= new IplEntity("Kolkata knight riders", "RedChillis", "Indian Premier legue ", "Shreyas Iyer", LocalDate.of(2000, 06, 07), 98000000L);
	
		ApplicationContext container = new ClassPathXmlApplicationContext("ipl.xml");
		IplService service=container.getBean(IplService.class);
		service.saveAndValidate(entity);
		System.out.println(entity.toString());
	}

}
