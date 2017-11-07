package elementarySorts.selectionSort;

public class Select4 {

	public static void main(String[] args) {

		int[] nums = { -1111, 2, 9, 8, 3, 1 };

		System.out.print("Initial: ");
		printArray(nums);

		for (int i = 0; i < nums.length; i++) {

			int min = i;

			for (int j = 0; j < nums.length; j++) {

				if (nums[min] < nums[j]) {
					min = j;
				}

				int temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;
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
