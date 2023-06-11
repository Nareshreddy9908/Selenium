package JavaPrograms;

import java.util.Arrays;

public class secondLargestinArray {

	public static void print2Largest(int arr[]) {

		int size = arr.length;

		if (size < 2) {
			System.out.println("Invalid Input...");
			return;
		}

		Arrays.sort(arr);
		System.out.println(arr[size-2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 4, 5, 35, 34};
		print2Largest(arr);

	}

}
