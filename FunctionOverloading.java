class FunctionOverloading {
	 final float pi = 3.14f;
        public void area(int a){
            int areaSquare = a * a;
            System.out.println(" The area of Square =" + areaSquare);
              
        }
         public void area(int a,int b){
             int areaRectangle = a*b;
             System.out.println("The area of Rectangle =" + areaRectangle);
        
    }
	public void area(float c){
		float areaCircle = pi*c*c;
		System.out.println("The radius of Circle=" + areaCircle);
	}
	public static void main(String args[]){
		FunctionOverloading obj= new FunctionOverloading();
		obj.area(3);
		obj.area(2,3);
		obj.area(3.54f);
}
}
