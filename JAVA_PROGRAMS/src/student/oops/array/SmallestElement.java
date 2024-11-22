package student.oops.array;

public class SmallestElement {
public static void main(String[] args) {
	int arr[]= {3,1,6,7,8,2};
	int small=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<small)
		{
			small=arr[i];
		}
	}
	System.out.println(small);
}
}
