package JavaPrograms;

public class captilizeWords {

	public static void main(String[] args) {

		String str = "naveen automation labs";

		String result = "";

		String words[] = str.split(" ");

		for(String word : words) {

			String first = word.substring(0, 1).toUpperCase(); // N
			String restString = word.substring(1);  // aveen

			result = result + first + restString + " "; //Naveen
		}
		
		System.out.println(result);
	
	}
}
