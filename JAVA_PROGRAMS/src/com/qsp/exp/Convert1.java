package com.qsp.exp;

public class Convert1 {
public static void main(String[] args) {
	String s="Hello";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			ch=(char)(ch+32);
		}
			else if(ch>='a'&&ch<='z')
			{
				ch=(char)(ch-32);
			}
		
		System.out.print(ch);
	}
	//System.out.println(ch);
	
	
}
}
