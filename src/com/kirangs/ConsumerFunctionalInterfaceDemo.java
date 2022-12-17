package com.kirangs;

import java.util.function.Consumer;

/**
 * Consumer<T> : Functional Interface
 * 
 * Represents an operation that accepts a single input argument and returns no
 * result.
 *
 * @param <T> the type of the input to the operation
 *
 * @since 1.8
 */

/**
 * Traditional way
 */
class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String string) {
		
		System.out.println(string);
	}
}

public class ConsumerFunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		//traditional way
		
		Consumer<String> consumer1=new ConsumerImpl();
		consumer1.accept("Kumar G S");

		//lambda
		
		Consumer<String> consumer = string -> System.out.println(string);
		consumer.accept("Kiran Kumar G S");

		String[] letters = { "a", "b", "c", "d", "e" };
		for (String letter : letters) {
			consumer.accept(letter);
		}

	}

}
