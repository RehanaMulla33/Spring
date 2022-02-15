package com.xworkz.passport;

import java.time.LocalDateTime;
import java.util.Date;

import com.xworkz.passport.entity.PassportEntity;

public class Tester {
	Date date=new Date();

	public static void main(String[] args) {
		PassportEntity entity=new PassportEntity("Passport Authority Of India",LocalDateTime.now(),"15/05/2032",
				'F',"12345678","Hubli Karnata","Suman",false,"Regular",'B+');

	}

}
