package JavaPrograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "java code";
		String[] words = input.split(" ");
		String revStr = "";

		for (String word : words) {
			String revWord = "";

			// revWord 
			for (int i = word.length() - 1; i >= 0; i--) {

				revWord = revWord + word.charAt(i);

			}
			revStr = revStr + revWord + " ";
		}
	}
}