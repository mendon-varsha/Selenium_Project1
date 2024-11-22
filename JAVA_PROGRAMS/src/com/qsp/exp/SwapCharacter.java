package com.qsp.exp;

import java.util.Scanner;

public class SwapCharacter {
public static void main(String[] args) {
	char ch1='a';
	char ch2='b';
	char temp=' ';
	temp=ch1;;
	ch1=ch2;
	ch2=temp;
	System.out.println("After swapping");
	System.out.println(ch1);
	System.out.println(ch2);
}
}

