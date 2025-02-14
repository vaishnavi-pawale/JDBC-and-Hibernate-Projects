package com.SingletonDesignPattern;

public class Test {

	private Test(){
		
	}
	
	public static Test test;
	
	public static Test getInstance() {
		
		if(test == null) {
			test = new Test();
		}
		
		return test;
		
	}
}
