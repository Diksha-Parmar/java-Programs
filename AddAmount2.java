
import java .util.Scanner;
public class AddAmount2{
	static int amount = 50;
	AddAmount2()
	{
		int a = 0;
	    amount = amount + a;
		System.out.println("Balance :" + amount);
	}
	AddAmount2(int a){
	
	 amount = amount + a;
	System.out.println("Balance : " + amount);
}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int amt;
	
	do{
			System.out.println("Enter the amount you want to enter::");
			amt = sc.nextInt();
			if(amt>0){
				AddAmount2 obj = new AddAmount2(amt);
				amt = amt + amount; 
			}
			else{
				System.out.println(" Final balance:" + amount);
			}
		}while(amt!=0);
		
	}	
}