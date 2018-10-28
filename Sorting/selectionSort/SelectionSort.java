package elementarySorts.selectionSort;

import java.io.Console;

public class SelectionSort {

	public static void main(String[] args) {

		int[] nums = { 4, 2, 9, 8, 3, 1 };

		System.out.print("Initial: ");
		printArray(nums);

		for (int i = 0; i < nums.length; i++) {

			int min = i;

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[j] <= nums[min]) {
					min = j;

				}

			}
			swap(nums, i, min);

		}

		System.out.println();
		System.out.print("Sorted: ");
		printArray(nums);

	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void swap(int[] a, int i, int min) {

		Object temp = a[i];
		a[i] = a[min];
		a[min] = (int) temp;

	}

}
