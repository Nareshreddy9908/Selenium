package JavaPrograms;

public class RemoveSpecialcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "34@#!@1$&";
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("after removing the special characters:" + str1);

		/*
		 * String str2 = "349acedu"; String str3 = str2.replaceAll("[^0-9]", "");
		 * System.out.println(str3);
		 * System.out.println("after removing the special characters:" + str3);
		 */
		
		

	}
}
