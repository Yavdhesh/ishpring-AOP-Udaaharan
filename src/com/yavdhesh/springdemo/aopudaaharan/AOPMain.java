package com.yavdhesh.springdemo.aopudaaharan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfiguration.class);
		
		AccountDAO accountDAO= context.getBean("accountDAO", AccountDAO.class);
		
		accountDAO.addAccount();
		
		context.close();
	}

}
