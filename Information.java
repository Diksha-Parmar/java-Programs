// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
//Create a subclass called Employee that adds a new method named getEmployeeId().
import java.util.Scanner;
 class Person{
	String FirstName,LastName;
	Scanner sc = new Scanner(System.in);
	public void getFirstName(){
		System.out.println("Enter First Name :: ");
		FirstName = sc.nextLine();
	}
	public void getLastName()
	{
		System.out.println("Enter Last Name :: ");
		LastName = sc.nextLine();
	}
 }
 class Employee extends Person{
	public void getEmployeeId(){
		System.out.println("Enter the EmployeeId:");
		int EmployeeId = sc.nextInt();
	}
	 public class Information{
	public static void main(String args[]){
		Information obj = new Information();
		obj.getFirstName();
		obj.getLastName();
		obj.getEmployeeId();
	}
}
 }

