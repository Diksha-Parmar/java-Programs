import java.util.Scanner;
public class program5{
	public boolean Program5(int a , int b , int c){
		if(b==(a+1) && c==(b+1)){
			System.out.print("Entered number is Consecutive:");
			return true;
		}
		else{
			System.out.print("Entered number is consecutive:");
			return false;
		}
     }
	public static void main(String args[]){
		int d,e,f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer value:");
		d=sc.nextInt();
		System.out.print("Enter second integer value:");
		e=sc.nextInt();
		System.out.print("Enter third integer value:");
		f=sc.nextInt();
			
		Program5 obj = new Program5();
		System.out.println(obj.Program5(d,e,f));
	}
	
}