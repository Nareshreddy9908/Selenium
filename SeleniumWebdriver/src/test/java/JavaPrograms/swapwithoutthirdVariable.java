package JavaPrograms;

public class swapwithoutthirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 50;
		int b = 90;

		System.out.println("Before swap..");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		a = a + b; // a=140
		b = a - b; // b=50
		a = a - b; // a = 90
         //a= b-a;
		System.out.println("After swapping..");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
