package com.program.java.others.java8.impl;

import java.util.Arrays;
import java.util.List;

public class WithLambdaExample {
	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee("Arun", 60000),new Employee("Karan", 30000),new Employee("David",45000));
		
		System.out.println("All Employee details");
		
		employees.forEach(emp -> System.out.println(emp.toString()));
		
		System.out.println("Employee salary more than 50000");
		
		employees.stream().filter(emp -> emp.getSalary() > 50000).forEach(emp -> System.out.println(emp.toString()));
		
		System.out.println("Employees sorted by name: ");
		
		employees.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).forEach(emp -> System.out.println(emp.toString()));
	}

}
