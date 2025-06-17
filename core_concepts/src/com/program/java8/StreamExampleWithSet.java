package com.program.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExampleWithSet {

	public static void main(String[] args) {

	    HashSet<String> countries = new HashSet<>();

        // Adding elements to the HashSet
        countries.add("India");
        countries.add("America");
        countries.add("China");
        countries.add("England");
        countries.add("Argentina");
        countries.add("Africa");
        countries.add("Asia");
        
       
      //  countries.stream().filter(country -> country.startsWith("A")).forEach(country -> System.out.println(country));
        
        Set<String> filtered =   countries.stream().filter(country -> country.startsWith("A")).map(String :: toUpperCase).sorted().collect(Collectors.toSet());
        
        System.out.println(filtered);

	}

}

