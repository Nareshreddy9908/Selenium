package JavaPrograms;

public class SwappingwithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "Hello";
		String str2="World";
		
		
		
		System.out.println("Before swaping..");
		System.out.println("str1=" +str1);
		System.out.println("str2=" +str2);
		
		String temp = str1;
		str1=str2;
		str2=temp;

		
		System.out.println("After swapping..");
		System.out.println("str1=" +str1);
		System.out.println("str2=" +str2);
		
		
		
	}

}
