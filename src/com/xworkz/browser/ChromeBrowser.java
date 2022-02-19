package com.xworkz.browser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.internet.Internet;

@Component
public class ChromeBrowser implements Browser {
	@Value("v21.45")
	private String version;
	@Value("FireFox-Browser")
	private String name;

	@Autowired
	@Qualifier("jioInternet")
	Internet internet;

	@Autowired
	@Qualifier("airtelInternet")
	Internet internet1;

	@Override
	public void surf() {
		this.internet.connect();
		this.internet1.connect();

	}

}
