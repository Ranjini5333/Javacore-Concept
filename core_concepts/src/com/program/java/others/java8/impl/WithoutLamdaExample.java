package com.program.java.others.java8.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithoutLamdaExample {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Arun", 60000), new Employee("Karan", 30000),
				new Employee("David", 45000));

		System.out.println("All Employee details");

		for (int i = 0; i < employees.size(); i++) {

			System.out.println(employees.get(i).name);

		}

		System.out.println("Employee salary more than 50000");

		for (int i = 0; i < employees.size(); i++) {

			double salary = employees.get(i).salary;

			if (salary > 50000) {

				System.out.println("Name is " + employees.get(i).name + " salary is " + salary);

			}

		}

		System.out.println("Employees sorted by name: ");

		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).name);

		}

	}

}
