package com.program.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {

	public static void main(String[] args) {

		List<String> countries = Arrays.asList("India","Japan");
		
		List<String> result = countries.stream().map(String::toUpperCase).toList();
		
		System.out.println(result);

	}

}
