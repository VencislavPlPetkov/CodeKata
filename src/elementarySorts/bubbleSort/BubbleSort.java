package elementarySorts.bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = { 11, 2, 9, 8, 3, 1 };

		System.out.print("Initial: ");
		printArray(nums);

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		
		System.out.print("Sorted: ");
		printArray(nums);

	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

}
