package com.example.demo;

public enum FortuneKind {
	GREAT("大吉"),
	MIDDLE("中吉"),
	SMALL("小吉"),
	MIS("凶");
	
	private final String value;
	
	private FortuneKind(String value) {
		this.value = value;
	}
	
	public String value() {
		return value;
	}
}
