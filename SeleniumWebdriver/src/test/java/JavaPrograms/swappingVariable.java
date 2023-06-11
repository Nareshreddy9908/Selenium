package JavaPrograms;

public class swappingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		System.out.println("Before swapping");
		System.out.println(" a= " + a);
		System.out.println(" b= " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swap");
		System.out.println(" a=" + a);
		System.out.println(" b=" + b);

	}

}
