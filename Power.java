import java.util.Scanner;
import java.lang.Math;
public class Power{
	public static double power(double a , double b){
		System.out.print("Result is:");
		return(Math.pow(a,b));
	  	
	
	}
	public static void main(String args[]){
		double num1 , num2;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the base number:");
		num1 = s1.nextDouble();
		System.out.println("Enter the exponent number:");
	 	num2 = s1.nextDouble();

		Power obj = new Power();
		System.out.println(obj.power(num1 , num2));

	}
}