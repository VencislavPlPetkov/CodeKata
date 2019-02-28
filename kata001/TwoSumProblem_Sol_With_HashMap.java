
import java.io.Console;
import java.util.HashMap;

/**
 * 
 * Find all the pairs of two integers in an unsorted array that sum up to a
 * given target number
 *
 * Ex: If the array is [3, 5, 2, -4, 8, 11] and the sum is 7, the program should
 * return [[11, -4], [2, 5]] because 11 + -4 = 7 and 2 + 5 = 7.
 *
 * HashMap solution is - O(n)
 *
 */

public class TwoSumProblem_Sol_With_HashMap {

	public static void main(String[] args) {

		// Input:

		int[] arr = { -2, -3, 6, 8, 6, -2, 7 };

		// int[] arr = { -2, 6, -2, 6 };

		int target = 4;

		// Sol:
		getTwoSumPairs(arr, target);

	}// end main

	private static HashMap<Integer, Boolean> getTwoSumPairs(int[] arr, int target) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		/**
		 * For every element in the array check if the map already contains the number
		 * needed to reach the target sum. If not - put the element in the map and
		 * continue searching
		 */
		for (int i = 0; i < arr.length; i++) {

			int numberNeededToReachTarget = target - arr[i];

			/**
			 * if matching number is found that summed together with num equals target - put
			 * both values in map with value set to true
			 */
			if (map.containsKey(numberNeededToReachTarget) && map.get(numberNeededToReachTarget) == false) {

				// Found Pair
				System.out.println(numberNeededToReachTarget + " + " + arr[i] + " = " + target);

				map.put(arr[i], true);
				map.put(numberNeededToReachTarget, true);

				/**
				 * if no matching number is found that summed together with num equals target
				 * and there isn't a duplicate that already is part of the result - add num and
				 * set value to false
				 */
			} else if (!map.containsKey(arr[i])) {

				map.put(arr[i], false);

			}
		}

		return map;

	}// end method

}// end class