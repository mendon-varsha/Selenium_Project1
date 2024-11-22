package com.qsp.exp;

public class OccuranceOfElements {
public static void main(String[] args) {
	int arr[]= {1,3,2,4,1};
	boolean b[]=new boolean[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		if(b[i]==false)
		{
			int count=1;
			for(int j=i+1;j<=arr.length;i++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					b[j]=true;
				}
			}
		}
	}
}
}
