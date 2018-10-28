package sorting;

public class QuicksortOneLoop {

	public static void main(String[] args) {

		int[] nums = { -1111, 2, 9, 8, 3, 1 };

		System.out.print("Initial: ");
		printArray(nums);

		sort(nums, 0, nums.length - 1);

		System.out.print("Sorted: ");
		printArray(nums);

	}// END of Main

	private static void sort(int[] nums, int low, int high) {

		if (low < high) {

			int pivot = partition(nums, low, high);

			sort(nums, low, pivot - 1);
			sort(nums, pivot + 1, high);

		}

	}

	private static int partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		int i = low - 1;

		
		for (int j = low; j < high; j++) {
			
			// increment j until we reach an element that is 
			// smaller than the pivot
			if (nums[j] <= pivot) {
				
				// i always stays just before an element that is 
				// bigger than the pivot, ready to be incremented
				// and swapped
				i++;

				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			
			}

		}
		
		// put the partitioning element at it's rightful place
		int temp = nums[i + 1];
		nums[i + 1] = nums[high];
		nums[high] = temp;

		return i + 1;

	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

}// END of class