import java.util.Scanner;
public class Currency{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of currency denominations::");
		size = sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the currency denomination ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay ");
		int amount =sc.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be::");
		while(amount>0){
			for(int i=0;i<size;i++){
				int value = amount/arr[i];
				amount = amount - value*arr[i];
				System.out.println(arr[i]+":"+ value);
			
				
			}
		}	
	}
}
	
