package elementarySorts.bubbleSort;

public class Bubble2 {

	public static void main(String[] args) {

		int[] nums = { -1111, 2, 9, 8, 3, 1 };

		System.out.print("Initial: ");
		printArray(nums);

		sort(nums);

		System.out.print("Sorted: ");
		printArray(nums);

	}// END of Main

	private static void sort(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length - 1; j++) {

				if (nums[j] > nums[j + 1]) {

					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;

				}

			}

		}

	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

}// END of class
