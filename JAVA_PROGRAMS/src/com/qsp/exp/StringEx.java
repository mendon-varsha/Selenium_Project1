package com.qsp.exp;

public class StringEx
{
	public static void main(String[] args) {
		String s="java";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'&&s.charAt(i)!='j')
			{
				s.toUpperCase();
			
		}
		
	}
		System.out.println(s);
}
}