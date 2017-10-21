package classicSorts;

public class QuickSortDiff {
	public static void main(String[] args) {

		int[] nums = { -1111, 2, 9, 8, 3, 1 };

		System.out.print("Initial: ");
		printArray(nums);

		sort(nums, 0, nums.length - 1);

		System.out.print("Sorted: ");
		printArray(nums);

	}// END of Main

	private static void sort(int[] nums, int low, int high) {

		int pivot = partition(nums, low, high);
		
		
	}

	private static int partition(int[] nums, int low, int high) {
		
		
		int i = low;
		int j = high;
		
		
		int pivot = nums[low];
		
		while(true) {
			
			while (nums[i++] < pivot) {
				if (i == high) {
					break;
				}
			}
			
			while (nums[j--] > pivot) {
				if (j == low) {
					break;
				}
			}
			
			
			if (i >= j) {
				break;
			}
			
			
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			
			
			return 0;
		}
		
		
		
		
		

	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

}// END of class



































