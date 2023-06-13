public class Array1{
	public static void main(String[] args){
		String sec = "Diksha";
		String third = "diksha";
		if (sec.equals(third)){
		System.out.println("true");
		}else{
			
			System.out.println("false");
		}
		String first = sec.concat(third);
		System.out.println("Addtion of two strings:"+first);
	}
}