package com.telusko.FactoryDesignPattern;

public class Phone {

	public static void main(String[] args) {
		
		FactoryDesign factory=new FactoryDesign();
		OS os=factory.getInstance("Other");
		os.spec();

	}

}
