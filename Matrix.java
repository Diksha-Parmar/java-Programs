import java.util.Scanner;
public class Matrix{
	public static void main(String args[]){
	Scanner s1=new Scanner(System.in);
	int row1,col1;
	int row2,col2;		
    System.out.print("Enter the rows of first array:");
	row1=s1.nextInt();
	System.out.print("Enter the columns of first array:");
	col1=s1.nextInt();
	int[][] arr3=new int[row1][col1];
	int[][] arr1= new int[row1][col1];
    for(int i=0;i<row1;i++){
			for(int j=0;j<col1;j++){
			System.out.print("Enter the values at position ["+i+"]["+j+"] :" );
			arr1[i][j]=s1.nextInt();
			}
		
		}
		System.out.print("Enter the rows of second array:");
		row2=s1.nextInt();
		System.out.print("Enter the columns of second array:");
		col2=s1.nextInt();
		int[][] arr2= new int[row2][col2];
		for(int i=0;i<row2;i++){
			for(int j=0;j<col2;j++){
			System.out.print("Enter the values at position ["+i+"]["+j+"] :" );
			arr2[i][j]=s1.nextInt();
			}
		
		} 
		if(row1==row2 && col1==col2){
		 for(int i=0;i<row1;i++)
        	{
          		for(int j=0;j<col1;j++)
        	      {
         			 arr3[i][j]=arr1[i][j] + arr2[i][j];
         		}
        	}

       	 System.out.println("Addition of Two matrix:");
        	 for(int i=0;i<row1;i++)
        	 {
          		for(int j=0;j<col1;j++)
        		 {
           			 System.out.print( arr3[i][j]+" "); 
         		 }
         	 System.out.println();
        	}
		}
		else{
			System.out.print("Invalid");
		}
	}
}	
