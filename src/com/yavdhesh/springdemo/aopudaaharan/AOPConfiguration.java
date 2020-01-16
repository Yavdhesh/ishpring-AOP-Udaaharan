package com.yavdhesh.springdemo.aopudaaharan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages={"com.luv2code.springdemo.aopudaaharan"})
public class AOPConfiguration {

	
	
	
}
