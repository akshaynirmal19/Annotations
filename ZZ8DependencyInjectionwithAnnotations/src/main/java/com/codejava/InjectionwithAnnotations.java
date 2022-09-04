package com.codejava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectionwithAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context =   new AnnotationConfigApplicationContext();
		context.scan("com.codejava");
		context.refresh();
		
		
		Client client1 = (Client) context.getBean("client1");
		client1.doSomething();
		
		
		Service service2 = (Service) context.getBean("service2");
		System.out.println(service2.getInfo());
		

	}

}
