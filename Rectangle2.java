public class Rectangle2{
	Rectangle2(){
		int length = 0;
		int breadth = 0;
		int area = length*breadth;
		System.out.println("Area of Rectangle" + area);
	}
	Rectangle2(int a , int b){
		int length = a;
		int breadth = b;
		int area = length*breadth;
		System.out.println("Area of Rectangle" + area);
	}
	Rectangle2(int a){
		int length = a;
		
		public static void main(String args[]){
			Rectangle2 rect = new Rectangle();
			Rectangle2 rect1 = new Rectangle2(1,2);
			Rectangle2 rect2 = new Rectangle2(30);
		}
	}
}
	
