public class Model{
	public static void main(String args[]){
		String first = "Diksha";
		String second = "diksha";
		if (first.equals(second)){
		System.out.println("true");
		}else{
			
			System.out.println("false");
		}
		String third = first.concat(second);
		System.out.println("Addtion of two strings:"+third);
	}
}