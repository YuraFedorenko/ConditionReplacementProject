package com.lollion.training.workSpace;

public class Pluss extends AbstaractMain{

	@Override
	public int calculate(int a, int b) {
		
		return a+b;
	}
	
	@Override
	public int calculate(String a, String b) {
		
		return Integer.parseInt(a+b);
	}

}
