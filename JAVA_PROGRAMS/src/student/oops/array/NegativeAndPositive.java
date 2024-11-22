package student.oops.array;

public class NegativeAndPositive {
public static void main(String[] args) {
	int pos=0;
	int neg=0;
	int arr[]=new int[5];
	arr[0]=-1;
	arr[1]=1;
	arr[2]=-4;
	arr[3]=-3;
	arr[4]=5;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<0)
		{
			pos++;
		}
		else
			neg++;
	}
	System.out.println("No of positive elements are"+pos);
	System.out.println("No of negative elements are"+neg);
	
}
}
