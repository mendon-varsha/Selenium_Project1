package student.oops.array;

public class BiggestElement {
public static void main(String[] args) {
	int arr[]= {3,6,2,8,9,1};
	int big=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>big)
		{
			big=arr[i];
		}
	}
	System.out.println(big);
	
}
}
