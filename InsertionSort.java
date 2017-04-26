public class InsertionSort extends Sorted{
	private int[] arr;
	private int last; 

	/** 
	 * Default constructor for Insertion Sort, just calls super with parameter arr
	 *
	 * @param arr The array that this class represents
	 */
	public InsertionSort(int[] arr){
		super(arr); 
		last = arr.length; 
	}


	/**
	 * Public sort method in Insertion sort class. Uses insertion sort to sort an array of ints
	 *
	 * @param originalData The array that needs to be sorted 
	 * @return the sorted array 
	 */
	public int[] sort(int[] originalData){
		int[] array; 
		array = new int[this.getItems().length];
		for (int n = 0; n < originalData.length; n++){
			array[n] = originalData[n];
		}
		for (int i = 1; i < originalData.length; i++){
			int temp = array[i];
			int possibleIndex = i; 
			while (possibleIndex > 0 && temp < array[possibleIndex - 1]){
				array[possibleIndex] = array[possibleIndex - 1]; 
				possibleIndex--;

			}
			array[possibleIndex] = temp; 
		}

		return array; 
	}
	
	public int get(int i){
		return arr[i];
	}


	public void add(int item){
		for (int i = 0; i < last; i++){
			if (item > getItems()[i]){
				for(int z = i; z < last; z++){
					getItems()[z+1] = getItems()[z];
				} 
				last++;
			}
		}
	}

}