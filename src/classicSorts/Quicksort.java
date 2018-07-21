package sorting;

public class Quicksort {

	
		public static void main(String[] args) {

			int[] nums = { -1111, 2, 9, 8, 3, 1 };

			System.out.print("Initial: ");
			printArray(nums);

			sort(nums, 0, nums.length - 1);

			System.out.print("Sorted: ");
			printArray(nums);

		}// END of Main

		private static void sort(int[] nums, int low, int high) {

			if (high <= low) {
				return;
			}
			
			int pivot = partition(nums, low, high);
			
			sort(nums, low, pivot - 1);
			
			sort(nums, pivot + 1, high);
			
		}

		private static int partition(int[] nums, int low, int high) {
			
			
			int i = low; // index to loop over the left part of the array
			int j = high + 1; // index to loop over the right part of the array
			
			
			int pivot = nums[low];
			
			while(true) {
				
	            // find item on the left part of the array to swap
				while (nums[++i] < pivot) {
					if (i == high) {
						break;
					}
				}
				
	            // find item on the right part of the array to swap
				while (nums[--j] > pivot) {
					if (j == low) {
						break;
					}
				}
				
	            // check if pointers cross
				if (i >= j) {
					break;
				}
				
				// swap the elements that are out of place from the left
				// and right part of the array
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				
				
				
			}
			
			
			// put partitioning item pivot in it's right place at nums[j]
			
			int temp = nums[low];
			nums[low] = nums[j];
			nums[j] = temp;
				
			
			// return the index of the element that is already in place
			return j;

		}
		
		

		private static void printArray(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + " ");
			}
			System.out.println();
		}

	}// END of class


