//Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". 
//Now, create an object for each of the class and call1 - method of parent class by object of parent class.
class Parent{
	String parent = "This is parent class";
	public void getInfo()
	{
		System.out.println(parent);
	}
}

class ChildClass extends Parent{
	String child = "This is child class";
	public void getValue()
	{
		System.out.println(child);
	}
}
public class Inheritance2{
	public static void main(String args[]){
		Parent parentclass = new Parent();
		parentclass.getInfo();
		ChildClass childclass = new ChildClass();
		childclass.getValue();
		childclass.getInfo();
		
	}
}