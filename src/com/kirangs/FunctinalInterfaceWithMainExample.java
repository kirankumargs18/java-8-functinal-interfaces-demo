package com.kirangs;


@FunctionalInterface
interface Shape{
	
	void draw();
}

/**
 * There are three ways we can provide implementation
 * to above interface
 * 
 * 1. Using traditional way
 * 2. Using anonymous inner class
 * 3. Using lambda expressions
 * */

/**
 * 1. Traditional way
 * 
 * creating one class and implementing Shape interface
 * */
class ShapeImpl implements Shape {

	@Override
	public void draw() {

		System.out.println("Implementation using traditional way");
	}

}

public class FunctinalInterfaceWithMainExample {
	
	public static void main(String[] args) {
		
		
		Shape shape1=new ShapeImpl();
		
		/**
		 * 2. Using anonymous inner class
		 * */
		Shape shape2=new Shape() {
			
			@Override
			public void draw() {
				
				System.out.println("Implementation using inner class");
			}
		};
		
		/**
		 * Using lambda expression
		 * */
		Shape shape3=()-> System.out.println("Implementation using lambda expression");
		
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
	}

}
