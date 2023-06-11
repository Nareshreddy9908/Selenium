package JavaPrograms;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Naresh";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--) 
			
			output = output+input.charAt(i);
			System.out.print(output);
		}
				

	

}
