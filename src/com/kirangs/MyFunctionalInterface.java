package com.kirangs;

/**
 * Functional Interfaces :
 * 
 * An Interface that contains exactly one abstract method
 * is known as a functional interface.
 * 
 * It can have any number of default, static methods but can contain only one
 * abstract method. It can also declare the methods of the object class.
 * 
 * Functional Interface is also known as Single Abstract Method Interfaces or
 * SAM Interfaces. It is a new feature in Java 8, which helps to achieve a
 * functional programming approach.
 * 
 * We will use lambda expressions to implement functional interfaces
 */


@FunctionalInterface
public interface MyFunctionalInterface {
	
	/**
	 * It must have only one abstract method
	 * */
	void print(String message);
	
	
	/**
	 * It can have any number of default methods
	 * */
	default void method1() {
		
		System.out.println("this is default method");
	}
	
	
	/**
	 * It can have any number of static methods
	 * */
	static void method2() {
		
		System.out.println("this is static method");
	}

}
