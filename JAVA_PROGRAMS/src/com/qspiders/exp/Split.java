package com.qspiders.exp;

public class Split {
	public static void main(String[] args) {
		String s="Java is easy";
		String a[]=s.split(" ");
		
		for(String i:a)
		{
			System.out.println(i);
		}
		String b[]=s.split("a");
		for(String i:b)
		{
			System.out.println(i);
		}
		String c[]=s.split("va");
		for(String i:c)
		{
			System.out.println(i);
		}
	}
	

}
