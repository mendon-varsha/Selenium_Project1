package student.oops.array;

import java.util.Scanner;

public class SortElements {
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
	sort(arr);
}
public static void sort(int arr[]) {
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
