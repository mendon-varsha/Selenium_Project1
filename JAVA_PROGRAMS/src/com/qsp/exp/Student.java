package com.qsp.exp;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	float per;
	
public Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
public String toString()
{
	return id+" "+name+" "+per;
}

public static void main(String[] args) {
	ArrayList <Student> s= new ArrayList <Student>();
	Student t=new Student(101, "Tina",80);
	s.add(t);
	Student v= new Student(102, "Miya",56);
	s.add(v);
	s.add(new Student(103, "Siya",95));
	for(Student p:s) {
		if(p.per>70)
		{
		System.out.println(p);
	}
	
	}
	
}
}
