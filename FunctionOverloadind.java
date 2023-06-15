class FunctionOverloading {
        public void area(int a){
            int areaSquare = a * a;
            System.out.println(" The area of Square =" + area of Square);
              
        }
         public void area(int a,int b){
             int areaRectangle = a*b;
             System.out.println("The area of Rectangle =" + area of rectangle);
        
    }
	public void area(float c){
		float AreaCircle = 3.14*c*c;
		System.out.println("The radius of Circle= + area of circle);
	}
	public static void main(String args[]){
		FunctionOverloading obj= new FunctionOverloading();
		obj.area(3);
		obj.area(2,3);
		obj.area(3.54f);
}
}