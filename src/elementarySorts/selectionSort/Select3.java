package elementarySorts.selectionSort;


public class Select3 {

	public static void main(String[] args) {

		int[] nums = { -1111, 2, 9, 8, 3, 1 };

		System.out.print("Initial: ");
		printArray(nums);

		
		for (int i = 0; i < nums.length; i++) {
			
			int lowest = i;
			
			for (int j = 0; j < nums.length; j++) {

				if (nums[j] > nums[lowest]) {
					
					lowest = j;
					
				}
				
				int temp = nums[lowest];
				nums[lowest] = nums[i];
				nums[i] = temp;
				
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
