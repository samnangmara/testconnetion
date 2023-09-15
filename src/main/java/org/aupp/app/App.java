package org.aupp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.aupp.model.Employee;

@SpringBootApplication
public class App {


	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		Employee emp = new Employee(1,"Peter Parker"); 
		System.out.println(emp.getId() + " --- " + emp.getName()); 
	}


}
