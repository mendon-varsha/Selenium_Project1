package student.oops.array;

public class EvenElements {
public static void main(String[] args) {
	int arr[]= {2,4,6,1,7};
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			System.out.println(arr[i]+"is even");
		}
	}
}
}
