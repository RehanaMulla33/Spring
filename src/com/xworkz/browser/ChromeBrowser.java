package com.xworkz.browser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ChromeBrowser implements Browser{
	@Autowired
	private String version;
	private String name;
	Internet internet;


	@Override
	public void surf() {
	this.internet.connect();
		
		
	}

}
