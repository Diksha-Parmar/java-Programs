
import java.util.Scanner;
public class Rectangle4{
	int length;
	int breadth;
	public void area(int a,int b){
		length=a;
		breadth=b;
		System.out.println("The area of rectangle is::"+length*breadth);
		
	}
	
	Rectangle4(){
		length=0;
		breadth=0;
		area(length,breadth);
	}
	
	Rectangle4(int x,int y){
		length=x;
		breadth=y;
		area(length,breadth);
	}
	
	Rectangle4(int x ){
		length=x;
		breadth=x;
		area(length,breadth);
	}
	
	public static void main(String args[]){
		Rectangle4 obj=new Rectangle4();
		
		Rectangle4 obj1=new Rectangle4(1);
		
		Rectangle4 obj2=new Rectangle4(2,3);
		
		
	}
}