package com.telusko.BuilderDesignPattern;

public class Shop {

	public static void main(String[] args) {
		
		PhoneBuilder builder=new PhoneBuilder();
		builder.setBattery(1);
		builder.setOsName("Windows");
		System.out.println(builder.getPhone());

	}

}
