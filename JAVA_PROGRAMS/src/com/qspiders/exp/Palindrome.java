package com.qspiders.exp;

public class Palindrome {
	public static void main(String[] args) {
		String a="MaLAYALAM";
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
		rev=rev+a.charAt(i);	
		}
		if(a.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");
	}

}
