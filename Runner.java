public class Runner {

	public static void main(String[] arguments) {
		
		// Some test data
		int[] testData = {4, 5, 7, 2, 0, -9};
		
		//TODO Make the object
		Sorted s = new InsertionSort(testData);
		
		System.out.println("Ensure the original data is preserved");
		for (int i = 0; i < testData.length; i++) {
			System.out.print(testData[i] + ", ");
		}
		
		//TODO Test the rest of your methods here.
		System.out.println("Test to see if the sort method works properly");
		s.sort(testData);
		for (int i = 0; i < testData.length; i++) {
			System.out.print(testData[i] + ", ");
		}
		
		System.out.println("Add item '4' to the array: ");
		s.add(4);
		for (int i = 0; i < testData.length; i++) {
			System.out.print(testData[i] + ", ");
		}
	}



}