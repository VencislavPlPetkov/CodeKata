package elementarySorts.insertionSort;


public class Insert2 {

	public static void main(String[] args) {

		int[] nums = { -1111, 2, 9, 8, 3, 1 };

		System.out.print("Initial: ");
		printArray(nums);

		
		
		for (int i = 0; i < nums.length; i++) {

			for (int j = i; j > 0; j--) {

				if (nums[j] < nums[j - 1]) {
					
					int temp = nums[j-1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
					
				}
				
			}
			
		}
		
		
		
		
		

		System.out.print("Sorted: ");
		printArray(nums);

	}// END of Main

	

	

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

}// END of class
