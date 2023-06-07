import java.util.Scanner;
public class Addition{
public static void main(String args[]){
Scanner s=new Scanner (System.in);
float a,b,c;
System.out.println("Enter first number");
a=s.nextFloat();
System.out.println("Enter second number");
b=s.nextFloat();
System.out.println("Enter third number");
c=s.nextFloat();
double sum=a+b+c;
int sum1=(int)(a+b+c);
System.out.println("Int Value" + sum1);
System.out.println("Float Value"+ sum);
}
}

