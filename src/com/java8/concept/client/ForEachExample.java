package com.java8.concept.client;

import java.util.Arrays;
import java.util.List;

import com.java8.concept.model.Employee;

public class ForEachExample {

	public static void main(String[] args) {
	    Employee e1 = new Employee("Ram", "Krishna", 70000.99);
	    Employee e2 = new Employee("Raghu", "Raghav", 80000.99);
	    Employee e3 = new Employee("Laxmi", "Shree", 45000.99);
	    Employee e4 = new Employee("karan", "swamy", 87000.99);
	    
	    List<Employee> empList = Arrays.asList(e1,e2,e3,e4);
	    
	    System.out.println("Using method ref");
	    // Iterate using forEach method with Methd ref
	    empList.forEach(System.out::println);
	    
	    // iterate usning lambda exp
	    System.out.println("using lambda exp...");
	    empList.forEach(x-> System.out.println(x));

	}

}
