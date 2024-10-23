package com.telusko.BuilderDesignPattern;

public class PhoneBuilder {
	
	private String osName;
	private int battery;
	private int ram;
	private Double screenSize;
	private String processor;
	
	public PhoneBuilder setOsName(String osName) {
		this.osName = osName;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(osName, battery, ram, screenSize, processor);
	}
	
}
