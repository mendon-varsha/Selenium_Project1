package student.oops.array;

public class Practice1 {
public static void main(String[] args) {
	int sum=0;
	int arr[]=new int[5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);
	System.out.println(arr.length);
}

}
