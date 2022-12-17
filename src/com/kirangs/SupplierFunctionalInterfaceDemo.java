package com.kirangs;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/**
 * Supplier<T> : Functional Interface
 * 
 * Represents a supplier of results.
 *
 * <p>There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * @param <T> the type of results supplied by this supplier
 *
 * @since 1.8
 */

/**
 * Traditional way of implementation
 */
class SupplierImpl implements Supplier<LocalDateTime> {

	@Override
	public LocalDateTime get() {

		return LocalDateTime.now();
	}

}
public class SupplierFunctionalInterfaceDemo {

	public static void main(String[] args) {

		// traditional way

		Supplier<LocalDateTime> supplier = new SupplierImpl();
		System.out.println(supplier.get());

		// lambda expression
		
		Supplier<LocalDateTime> supplier2 = () -> LocalDateTime.now();
		System.out.println(supplier2.get());

		Supplier<LocalDateTime> supplier3 = () -> {

			return LocalDateTime.now();
		};
		System.out.println(supplier3.get());
	}

}
