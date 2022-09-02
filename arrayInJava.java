public class arrayInJava{
	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		String[] userNames = {"Suman", "Sanam", "Rahul"};

		for (int i : numbers) {
			System.out.println("My "+i+" Hello to "+userNames[i-1]);
			
		}



	}
}