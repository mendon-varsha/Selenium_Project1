package student.oops.array;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElementToIndex {
private static int narr;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the ele to be inserted");
	int ele=sc.nextInt();
	System.out.println("Enter the index the element to be inserted");
	int index=sc.nextInt();
	int z[]=inserts(arr,ele,index);
	System.out.println(Arrays.toString(z));
}
public static int[] inserts(int arr[],int ele, int index)
{
	if(index<0||index>arr.length)
		return null;
	int z[]=new int[arr.length+1];
	z[index]=ele;
	for(int i=0;i<arr.length;i++)
	{
		if(i<index)
		{
			z[i]=arr[i];
		}
		else
			z[i+1]=arr[i];
	}
	return z;
}
}
