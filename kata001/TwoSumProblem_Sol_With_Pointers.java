
import java.io.Console;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * Find all the pairs of two integers in an unsorted array that sum up to a
 * given target number
 *
 * Ex: If the array is [3, 5, 2, -4, 8, 11] and the sum is 7, the program should
 * return [[11, -4], [2, 5]] because 11 + -4 = 7 and 2 + 5 = 7.
 *
 *
 */

public class TwoSumProblem_Sol_With_Pointers {

	public static void main(String[] args) {

		// Input:

		int[] arr = { -3, 8, 6, -2, 7 };

		int target = 4;

		// Sol:

		
		// Sort arr
		Arrays.sort(arr);

		
		// Pointers
		int i = 0;

		int j = arr.length - 1;

		
		
		// Until the two pointers cross
		while (i < j) {

			if (arr[i] + arr[j] < target) {

				i++;

			}

			if (arr[i] + arr[j] > target) {

				j--;

			}

			if (arr[i] + arr[j] == target) {

				System.out.println(arr[i] + " + " + arr[j] + " = " + target);
				i++;

			}

		}// while

	}// main

}