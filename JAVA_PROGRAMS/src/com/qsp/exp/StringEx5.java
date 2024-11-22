package com.qsp.exp;

public class StringEx5 {
public static void main(String[] args) {
	String s="java";
	String n="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='a') {
			ch=(char)(ch-32);
		}
		System.out.print(ch);
	}
}
}
