import java.util.Scanner;
public class Sum{
	public int getTotal(int a , int b){
		return(a + b);
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Sum obj = new Sum();
		System.out.println("Enter first number");
		int num1 = s.nextInt();
		System.out.println("Enter second number");
		int num2 = s.nextInt();
		int sum1 = obj.getTotal(num1,num2);
		System.out.println("Sum of the numbers are:" + sum1);
	}
}
	