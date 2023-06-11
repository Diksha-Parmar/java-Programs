public class Functions{
	public int Smaller(int a,int b,int c){
	
		if(a<b){
			if(a<c)
			{
				System.out.println("a is smaller number:"+a);
			}
				else{
					System.out.println("c is greater  number" +c);
				}
				
		}
		else{
			if(b<c)
			{
				System.out.println("b is smallest number:" +b);
			}
			else{
				System.out.println("c is smallest number:"+c);
			}
		}		
		return 1;
	
	}
		public static void main(String args[]){
			Functions functions=new Functions();
			functions.Smaller(18,17,2);
		}
	
			
}				
				