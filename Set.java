import java.util.Scanner;
public class Set{
	public static void main(String args[]){
	  Scanner s1 = new Scanner(System.in);
      int n;
	  int evensum = 0;
	  int oddsum = 0;
	  System.out.print("How many numbers you want to enter:");
	  n = s1.nextInt();
        int[] arr = new int[n];
	  for(int i=0;i<n;i++){
		System.out.print("Enter number at  position:" );
		arr[i] = s1.nextInt();
		if(arr[i] % 2 == 0){
			evensum = evensum + arr[i];
		}
		else{
			oddsum = oddsum + arr[i];
		}

	  }
	  System.out.println("Sum of even numbers:" +evensum);
	  System.out.println("Sum of odd numbers:" +oddsum);

        

	}
}
	  