package JavaPrograms;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  str = "NareshReddy";
		int len =str.length();
		char[] ch =str.toCharArray();
		
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				if(ch[i] ==ch[j]) {
					System.out.println("Duplicate characters are :" +ch[j]);
					break;
				}
			}
		}
 	}

}
