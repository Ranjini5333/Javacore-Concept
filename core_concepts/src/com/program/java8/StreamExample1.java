package com.program.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamExample1 {

	public static void main(String[] args) {
		
		


		ArrayList<String> countries = new ArrayList<String>();

		countries.add("India");
		countries.add("America");
		countries.add("Japan");
		countries.add("China");
		countries.add("Japan");
		countries.add("Taiwan");
		countries.add("Southi Arabia");
		countries.add("Argentina");
		countries.add("Africa");
		
		for(int i=0;i<countries.size();i++) {
			
			
			
		}

		for (String country : countries) { // Enhanced for loop

			if (country.startsWith("A")) { // condition

				System.out.println(country.toUpperCase());
			}
		} 

		List<String> result = countries.stream().filter(country -> country.startsWith("A")).map(String::toUpperCase).toList();

		// source intermediate termination

		System.out.println(result);

	}

}
