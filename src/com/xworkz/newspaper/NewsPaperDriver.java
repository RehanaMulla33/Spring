package com.xworkz.newspaper;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.newspaper.entity.NewsPaperEntity;
import com.xworkz.newspaper.repository.NewPaperRepository;
import com.xworkz.newspaper.repository.NewsPaperRositoryImpl;

public class NewsPaperDriver {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		NewPaperRepository repo = (NewPaperRepository) container.getBean("NewPaperRepository");
		NewsPaperEntity entity = new NewsPaperEntity("The Hindu", "English", 6.50, LocalDate.of(02, 22, 2022), 10);
		repo.insert(entity);
		System.out.println("record inserted successfully");

		repo.updateNewsPaperEntity(2, "Marathi");
		System.out.println("record updated successfully");

		repo.deleteNewsPaperById(1);
		System.out.println("record deleted successfully");

		repo.readNewsPaperEntity(1);
		System.out.println("NewsPaper =" + entity);

	}

}
