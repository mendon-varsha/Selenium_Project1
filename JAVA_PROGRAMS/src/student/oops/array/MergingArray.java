package student.oops.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergingArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array 1");
	int n1=sc.nextInt();
	int arr1[]=new int[n1];
	System.out.println("Enter the array elements");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=sc.nextInt();
	}
	System.out.println("Enter the size of array2");
	int n2=sc.nextInt();
	int arr2[]=new int[n2];
	System.out.println("Enter the array elements");
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]=sc.nextInt();
	}
	int newArr[]=merge(arr1,arr2);
	System.out.println(Arrays.toString(newArr));
}
public static int[] merge(int arr1[],int arr2[])
{
	int arr3[]=new int[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++)
	{
		arr3[i]=arr1[i];
	}
	for(int i=0;i<arr2.length;i++)
	{
		arr3[i+arr1.length]=arr2[i];
	}
	return arr3;
}
}

