public class Student{
	Student(){
		System.out.println("Unknown");
	}
	Student(String a){
		System.out.println("The name of the student is:"+a);
	}
		
	public static void main(String args[]){
		Student std=new Student();
		Student std1=new Student("Diksha");
	}
	}
		
	