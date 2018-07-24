package sorting;

public class Mergesort {

	public static void main(String[] args) {
		int[] arr = {-3,8,6,-2};
		
		
		sort(arr, 0, arr.length - 1);
			
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
		
	}//main

	
	
	
	private static void sort(int[] arr, int low, int high ) {
		
		if (low < high) {
			
			int middle = (low + high)/2;
			
			sort(arr, low, middle);
			sort(arr, middle + 1, high);
			
			merge(arr, low, middle, high);
			
		}	
		
	}
	
	
	
	private static void merge(int[] arr, int low, int middle , int high ) {
		
		int[] tempArr = new int[arr.length];
		
		// copy arr in tempArr
		
		for (int i = low; i <= high; i++) {
			tempArr[i] = arr[i];
		}
		
		
		
		int leftIndexTempArr = low;
		int rightIndexTempArr = middle + 1;
		int currElemMainArr = low;
		
		
		while (leftIndexTempArr <= middle 
				&& rightIndexTempArr <= high) {
			
			
			if (tempArr[leftIndexTempArr] < tempArr[rightIndexTempArr]) {
			
				arr[currElemMainArr] = tempArr[leftIndexTempArr];
				leftIndexTempArr++;
				
			} else {
				
				arr[currElemMainArr] = tempArr[rightIndexTempArr];
				rightIndexTempArr++;
				
			}
			
			
			currElemMainArr++;
			
		}
		
		
		
		int remaining = middle - leftIndexTempArr;
		
		
		for (int i = 0; i <= remaining; i++) {
			
			arr[currElemMainArr+i] = tempArr[leftIndexTempArr + i];
	
		}
		
		
		
	
	}
	
	
}//class

