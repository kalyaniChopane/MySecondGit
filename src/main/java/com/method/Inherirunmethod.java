package com.method;

public class Inherirunmethod {

public static void main(String[] args) {
		
		Inhertancepractise ref1 = new Inhertancepractise();
		ref1.morning();
		ref1.night();
		
		System.out.println("------------");
		
		Bclassinherit ref2 = new Bclassinherit();
		ref2.night();
		
		System.out.println("------------");
		
		Inhertancepractise ibref= new Bclassinherit();
		ibref.morning();
		ibref.night();
		System.out.println(ibref.x);
	}
	
}
