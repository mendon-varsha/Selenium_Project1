package student.oops.array;

public class CountOddElements {
public static void main(String[] args) {
	int arr[]= {1,3,4,5,6,7,9};
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			count++;
			
		}
	}
	System.out.println(count);
}
}
