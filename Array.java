import java.util.Scanner;
public class Array{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("Enter the size of array::");
		n = s.nextInt();
		int[] arr= new int[n];
		for(i=0;i<n;i++)
		
		{
			System.out.println("Enter the array value at "+(i+1)+" index ");
			arr[i]=s.nextInt();
			sum = sum + arr[i];
			
		}
		System.out.println("Sum of Array" + sum);
		for(i=0;i<n;i++){
			
		System.out.println("value at "+(i+1)+" position is "+ arr[i]);
		}
	}
}
		
		