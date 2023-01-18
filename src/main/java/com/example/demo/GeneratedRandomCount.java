package com.example.demo;

public class GeneratedRandomCount {
	private double value;
	
	private GeneratedRandomCount(double value) {
		this.value = value;
	}
	
	public FortuneKind toFortune() {
		if (value >= 0.7) {
			return FortuneKind.GREAT;
		}
		if (value >= 0.4) {
			return FortuneKind.MIDDLE;
		}
		if (value >= 0.1) {
			return FortuneKind.SMALL;
		}
		
		return FortuneKind.MIS;
	}
	
	public static GeneratedRandomCount from() {
		return new GeneratedRandomCount(Math.random());
	}
}
