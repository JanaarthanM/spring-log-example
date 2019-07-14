package com.example.demo.propsfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp.getEmpName());
	}

}
