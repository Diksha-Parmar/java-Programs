import java.util.Scanner;
public class Variables{
	public static void main(String args[]){
		Scanner s1=new Scanner(System.in);
		int a;
		float b;
		char c;
		Double d;
		
		System.out.println("Enter integer value");
		a=s1.nextInt();
		System.out.println("Value of a "+ a);
		System.out.println("Enter float value");
		b=s1.nextFloat();
		System.out.println("Enter value of b "+ b);
		System.out.println("Enter char value");
		c=s1.next().charAt(0);
		System.out.println("Enter value of c "+ c);
		System.out.println("Enter double value");
		d=s1.nextDouble();
		System.out.println("Enter value of d "+ d);
	}
}
		