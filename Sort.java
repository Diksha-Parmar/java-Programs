import java .util.Scanner;
public class Sort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int temp;
		System.out.println("Enter the Size of Array::");
		int size=sc.nextInt();
		int arr[]=new int [size];
		
		for(int i = 0;i < size;i++){
			System.out.println("Enter the element::");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the order in which you want to sort the array 1 - descending 2 - acending::");
		int choice = sc.nextInt();
		System.out.println("Sorted Array::");
		if (choice == 2){
			for(int i = 0; i<size;i++){
				for(int j = i+1;j<size;j++){
					if(arr[i]>arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			
		}
			else{
			for(int i = 0; i<size;i++){
				for(int j = i+1;j<size;j++){
					if(arr[i]<arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			}
			
			for(int i = 0; i<size;i++){
				System.out.println(arr[i]);
			}
			
		}
			
		
		
	}
