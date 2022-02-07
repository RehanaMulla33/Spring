package com.xworkz.animation;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.String;

public class Director {

	public static void main(String[] args) {

		String xmlFilePath = "resources/spring.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath);

		// AnimeCharacter ref=context.getBean(AnimeCharacter.class);
		// ref.init();

		// Laptop ref1=context.getBean(Laptop.class);
		// ref1.start();

		// Doctor ref2=context.getBean(Doctor.class);
		// ref2.treat();

		// Minister ref3=context.getBean(Minister.class);
		// ref3.curruption();

		// Corona ref4=context.getBean(Corona.class);
		// ref4.happy();

//		String ref5 = context.getBean(String.class);
//		int str = ref5.hashCode();
//		System.out.println(str);

//		Juice juc = context.getBean("juice",Juice.class);
//		boolean bln=juc.weightGain();
//		System.out.println(bln); 	

//		Juice juc = context.getBean("juice1",Juice.class);
//		juc.greenJuice();

//		Paint pnt = context.getBean("paint", Paint.class);
//		boolean deco = pnt.decorate();
//		System.out.println(deco);
//
//		Paint pnt1 = context.getBean("paint1", Paint.class);
//		pnt1.aisainPaint();

//		Mask msk=context.getBean("mask",Mask.class);
//		String str=msk.lifeSave();
//		System.out.println(str.toString());

//		Mask msk=context.getBean("mask1",Mask.class);
//		msk.notGood();

//		SimCard sim=context.getBean("sim",SimCard.class);
//		sim.port();

//		SimCard sim=context.getBean("sim1",SimCard.class);
//		boolean sm=sim.sim();
//		System.out.println(sm);

//		Purifier puri=context.getBean("purify",Purifier.class);
//		puri.waterPurifier();

//		Purifier puri=context.getBean("purify1",Purifier.class);
//		boolean water=puri.doesntItPurify();
//		System.out.println(water);
//		
//		Tablet tab=context.getBean("tablet1",Tablet.class);
//		boolean cure=tab.medicineKit();
//		System.out.println(cure);

//		Tablet tab = context.getBean("tablet", Tablet.class);
//		tab.cure();

//		Steamer stm = context.getBean("steamer", Steamer.class);
//		stm.steam();
//		
//		Steamer stm1 = context.getBean("steamer1", Steamer.class);
//		boolean value=stm1.typesOfSteamer();
//		System.out.println(value);

//		Oximeter oxm = context.getBean("oximeter1", Oximeter.class);
//		boolean read = oxm.reading();
//		System.out.println(read);

//		Oximeter oxm1 = context.getBean("oximeter1", Oximeter.class);
//		oxm1.check();
//
//		Tissue tsu = context.getBean("tissue", Tissue.class);
//		tsu.carry();

//		Tissue tsu1 = context.getBean("tissue", Tissue.class);
//		tsu1.wipe();
//		
//		Sanitizer snt = context.getBean("sanitizer", Sanitizer.class);
//		snt.kiilGerms();

		Sanitizer snt1 = context.getBean("sanitizer", Sanitizer.class);
		snt1.sanitize();

	}

}
