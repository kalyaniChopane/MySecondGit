package com.selenium;

public class MemoryAllocation {

	
	public static void main(String[] args) 
	{
		MemoryAllocation memory=new MemoryAllocation();
		memory.india();
		memory.maharashtra();
		memory.pune();		
	}
	public void india()
	{
		System.out.println("country");
		int a=10;
		System.out.println(a);
	}
	public void maharashtra()
	{
		System.out.println("State");
		String name="shreya";
		System.out.println(name);
	}
	public void pune()
	{
		System.out.println("Dist");
		char letter='K';
		System.out.println(letter);
		
	}
}


