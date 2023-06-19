public class Rectangle3{
	int length;
	int breadth;
	Rectangle3(){
		length=0;
		breadth=0;
		 int area = length*breadth;
		 System.out.println(" The area of Rectangle is : " + area);
	}
	
	Rectangle3(int x,int y){
		length=x;
		breadth=y;
		 int area = x*y;
		 System.out.println(" The area of Rectangle is : " + area);
	}
	
	Rectangle3(int c ){
		length=c;
		breadth=c;
		 int area = c*c;
		 System.out.println(" The area of Rectangle is : " + area);
	}
	
	public static void main(String args[]){
		Rectangle3 rect=new Rectangle3();
		
		Rectangle3 rect1=new Rectangle3(2);
		
		Rectangle3 rect2=new Rectangle3(2,3);
		
		
	}
}