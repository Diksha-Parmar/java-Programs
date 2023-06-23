 /*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B.
 Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
 It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
 The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
 Create an object for each of the two classes and print the percentage of marks for both the students.*/
 
 
abstract class Marks{
	 abstract float getPercentage();
}
class A extends Marks1{
	 float English,Maths,Science;
	 A(float Eng,float Math,float Sci)
	{
			English = Eng;
			Maths = Math;
			Science = Sci;
			
	}
	public float getPercentage()
	{
		return((English+Maths+Science)/300*100);
	}
	
}
class B extends Marks1{
	 float English,Maths,Science,Hindi;
	B(float Eng,float Math,float Sci,float hindi)
	{
		English = Eng;
		Maths = Math;
		Science = Sci;
		Hindi = hindi;
	}
	public float getPercentage(){
		return((English+Maths+Science+Hindi)/400*100);
	}
}
public class Marks1{
	public static void main(String args[]){
		A obj1 = new A(93,47,70);
		B obj2 = new B(93,89,80,90);
		System.out.println("Percentage of  A::" +obj1.getPercentage());
		System.out.println("Percentage of  B::" +obj2.getPercentage());
	}
}
