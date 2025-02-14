package com.SingletonDesignPattern;

public class Controller {

	public static void main(String[] args) {
		
		Test obj = Test.getInstance();
		System.out.println(obj.hashCode());
		
		Test obj1 = Test.getInstance();
		System.out.println(obj1.hashCode());
		
		Test obj2 = Test.getInstance();
		System.out.println(obj2.hashCode());
	}
}
