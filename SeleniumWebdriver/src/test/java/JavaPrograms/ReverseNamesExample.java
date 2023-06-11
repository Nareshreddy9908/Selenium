package JavaPrograms;
public class ReverseNamesExample {
	
    public static void main(String[] args) {
    	
        String fullName = "Naresh Reddy";
        String[] names = fullName.split(" ");
        
        StringBuilder reversedFullName = new StringBuilder();
        for (int i = names.length - 1; i >= 0; i--) {
            reversedFullName.append(names[i]);
            if (i != 0) {
                reversedFullName.append(" ");
            }
        }
        
        String reversedNames = reversedFullName.toString();
        System.out.println(reversedNames);
    }
}