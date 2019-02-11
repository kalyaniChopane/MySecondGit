package com.practice;

public class MethodConst {
	
	public MethodConst()//constructor
	{
		System.out.println("I am constructor");
	}
	int x=10;//non-static variable
	static int y=20;//static variable
	public static void main(String[] args) {
		int k=40;
		
		System.out.println("Hello maharashtra");
		MethodConst method=new MethodConst();
		System.out.println(k);
		method.Abc();//call to method
		method.def();
		System.out.println(method.x);
		System.out.println(MethodConst.y);
		
		Firstjavapg first=new Firstjavapg();//second class object for calling second class method
		first.day();
		Firstjavapg.night();
		System.out.println(first.a);
		System.out.println(Firstjavapg.Name);
		
		ThirdparaConst third=new ThirdparaConst(20);//creating third class object for calling constructor
		third.contmethod();//------method of third class
	}
	
	public void Abc()//method
	{
		System.out.println("Hello world");
	}
	public void def()//method
	{
		System.out.println("Hello india");
		
	}
}
