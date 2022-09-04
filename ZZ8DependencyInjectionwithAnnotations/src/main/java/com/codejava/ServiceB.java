package com.codejava;

import org.springframework.stereotype.Component;

@Component("service")
public class ServiceB implements Service {

	public String getInfo() {
		// TODO Auto-generated method stub
		return "Service B Info";
	}

}
