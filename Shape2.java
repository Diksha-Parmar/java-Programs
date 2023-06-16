class Rectangle{
			Rectangle(int a , int b){
			int length = a;
			int breadth = b;
			int area= length*breadth;
			System.out.println(" Area of Rectangle : " + area);
		
		}
}
		class Square extends Rectangle{
			Square(int a){
				super(a,a);
				int length = a;
				int area = (length*length);
		     System.out.println("Area of Square : " + area);
			 
			}
		}
		public class Shape2{
			public static void main(String args[]){
				Square sq = new Square(2);
			}
		}
		

				
			
			
		
			
				