package com.qspiders.exp;

public class Convert {
public static void main(String[] args) {
	String s="aBCcd12E3";
	String upper="";
	String lower="";
	String number="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=65 && s.charAt(i)<=90)
		{
			upper=upper+s.charAt(i);
		}
		else if (s.charAt(i)>=97 && s.charAt(i)<=122)
		{
			lower=lower+s.charAt(i);
		}
		else if(s.charAt(i)>=48 && s.charAt(i)<=57)
		{
			number=number+s.charAt(i);
		}
	}
	System.out.println(lower+upper+number);
}
}