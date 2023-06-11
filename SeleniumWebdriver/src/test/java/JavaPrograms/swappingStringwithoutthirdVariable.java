package JavaPrograms;

public class swappingStringwithoutthirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Naresh";
		String str2 = "Reddy";

		System.out.println("Before swapping..");
		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);

		str1 = str1 + str2;

		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		
		
		System.out.println("After swapping..");
		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);

	}

}
