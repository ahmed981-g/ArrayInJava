import java.util.ArrayList;
import java.util.Arrays;

public class arrayInJava{
	public static void main(String[] args) {
		String[] userList = {"Andy", "Rishab", "Mahesh"};
		// Displaying Whole Array

		System.out.println(Arrays.toString(userList));

		// Selecting an Element

		System.out.println(userList[0]);

		// Looping through Array

		for (String i : userList) {
			System.out.println(i);
		}

		// Length of an Array
		System.out.println(userList.length);

		// MULTIDIMENSIONAL ARRAY

		int[][] numbers = {
			{1, 3, 5},
			{2, 4, 6}
		};
		System.out.println("---------------------------");
		System.out.println(numbers[0][0]);
		System.out.println("---------------------------");

		// Printing each element
		for (int[] j : numbers) {
			for (int k : j) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		// Printing Array as String

		System.out.println(Arrays.deepToString(numbers));



		// Updating an array

		numbers[0][0] = 9;
		System.out.println(Arrays.deepToString(numbers));

		// ArrayList is different from Array but does what you need 
		
		ArrayList<Integer> newNumbers = new ArrayList<Integer>();
		newNumbers.add(numbers[0][0]);
		newNumbers.add(12);
		newNumbers.add(15);


		newNumbers.set(1, 3);

		System.out.println(newNumbers);




	}
}