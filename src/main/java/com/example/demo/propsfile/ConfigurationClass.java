package com.example.demo.propsfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:emp.properties")
public class ConfigurationClass {

	@Bean("employee")
	public Employee getEmployee() {
		return new Employee();
	}
}
