package student.oops.array;

public class PrimeNumberInArray {
public static void main(String[] args) {
	int arr[]= {3,6,1,8,5,9,70,34};
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]<=2)
		{
			//System.out.println("Not a prime number");
			System.out.println(arr[i]);
		}
	}
}
}
