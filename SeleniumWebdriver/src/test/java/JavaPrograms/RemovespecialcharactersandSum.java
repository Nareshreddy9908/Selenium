package JavaPrograms;

public class RemovespecialcharactersandSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input= "34@#!@1$&";
		
		String cleanedString =input.replaceAll("[^0-9]", "");
		
		int sum=0;
		
		for(int i=0;i<cleanedString.length();i++) {
			
			char c =cleanedString.charAt(i);
			
			int numericValue =Character.getNumericValue(c);
			
			sum+= numericValue;
			
		}
		
		System.out.println("after removing the sum of the characters:"+sum);
	}

}
