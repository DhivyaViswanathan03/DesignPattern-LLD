package com.telusko.BuilderDesignPattern;

public class Phone {

	private String osName;
	private int battery;
	private int ram;
	private Double screenSize;
	private String processor;
	
	public Phone(String osName, int battery, int ram, Double screenSize, String processor) {
		super();
		this.osName = osName;
		this.battery = battery;
		this.ram = ram;
		this.screenSize = screenSize;
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "Phone [osName=" + osName + ", battery=" + battery + ", ram=" + ram + ", screenSize=" + screenSize
				+ ", processor=" + processor + "]";
	}
	
	
}
