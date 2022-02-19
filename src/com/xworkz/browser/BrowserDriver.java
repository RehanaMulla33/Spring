package com.xworkz.browser;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BrowserDriver {

	public static void main(String[] args) {
ApplicationContext container=new ClassPathXmlApplicationContext("browser.xml");
container.getBean(Browser.class).surf();	
}

}
