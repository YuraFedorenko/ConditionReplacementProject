package com.lollion.training.workSpace;

public class ConditionReplacemntMain {
	public static void main(String[] args) throws Exception {
		System.out.println("result is :" + oopMethod(6,4,new Pluss()));
		System.out.println("result is :" + oopMethod(6,4,new Minus()));
		System.out.println("result is :" + oopMethod(6,4,new Divide()));
		System.out.println("result is :" + oopMethod(6,4,new Multiply()));
		System.out.println("result is :" + oopMethod("6","4",new Pluss()));
		
	}

	public static <T extends AbstaractMain> int oopMethod(int a, int b, T params) throws Exception {
		
		return params.calculate(a,b);
	
	}
	public static <T extends AbstaractMain> int oopMethod(String a, String b, T params) throws Exception {
		
		return params.calculate(a,b);
	
	}
}