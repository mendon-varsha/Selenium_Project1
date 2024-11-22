package student.oops.array;

import java.util.Scanner;

public class ReverseOrder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=sc.nextInt();
	System.out.println("Enter the array elements");
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
}
}
