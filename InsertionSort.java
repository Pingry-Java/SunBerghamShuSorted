public class InsertionSort extends Sorted{

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
		int[] array = new int[originalData.length];
		for (int n = 0; n < originalData.length; n++){
			array[n] = originalData[n];
		}
		for (int i = 1; i < originalData.length; i++)
		{
			int temp = array[i];
			int j; 
			for (j = i - 1; j>= 0 && temp < array[i]; j--)
			{
				array[j + 1] = array[j];
			}
			array[j+1] = temp;
		}

		return array; 
		
		
	}
	
	public int get(int i){
		return getItems()[i];
	}


	public void add(int item){
		for (int i = 1; i < last; i++)
		{ 
			if (item > getItems()[i])
			{
				for(int z = i; z < last; z++)
				{
					getItems()[z] = getItems()[z-1];
				} 
			}
		}
		last++;
	}
	
	System.out.println();

}