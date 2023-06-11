package JavaPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "programming";
		
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<str.length();i++) {
			
			
			char ch =str.charAt(i);
			int idx =str.indexOf(ch,i+1);
			
			if(idx==-1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
