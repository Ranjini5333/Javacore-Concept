package com.program.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample3 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Raja", "Arun", "David");

		names.forEach(name -> System.out.println(name));

	}

}
