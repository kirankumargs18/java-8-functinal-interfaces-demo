package com.kirangs;

import java.util.function.Function;


/**
 * Function<T,R> : Functional Interface
 * 
 * Represents a function that accepts one argument and produces a result.
 *
 * @param <T> the type of the input to the function
 * @param <R> the type of the result of the function
 *
 * @since 1.8
 * 
 * */

/**
 * Traditional way of implementing functional interface
 * */
class FunctionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String string) {

		return string.length();
	}

}
public class FunctionFunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		/**
		 * using traditional way
		 * */
		Function<String, Integer> function = new FunctionImpl();
		System.out.println(function.apply("Kiran Kumar G S"));
		
		/**
		 * using lambda to implement functional interface
		 * */
		Function<String, Integer> function2 = string -> string.length();
		System.out.println(function2.apply("Kiran"));
		
		/**
		 * using anonymous inner class
		 * */
		Function<String, Integer> function3 = new Function<String, Integer>() {

			@Override
			public Integer apply(String string) {

				return string.length();
			}
		};
		
		System.out.println(function3.apply("Kumar G S"));
		
	}

}
