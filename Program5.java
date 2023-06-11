import java.util.Scanner;
public class Program5{
	public boolean consec_num(int a , int b , int c){
		if(b==(a+1) && c==(b+1)){
			return true;
		}
			else{
				return false;
			}
			public static void main(String args[]){
			int c,d;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first number:");
			c=s.nextInt();
			System.out.println("Enter second number:");
			d=s.nextInt();
			
			Program5 obj = new Program5();
			System.out.println(obj.consec_num(c,d));
		}
	}
	}



			