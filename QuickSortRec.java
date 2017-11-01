/** Sorting array recursively using Quick sort; descending and ascending
	@author Elshaday Assefa
	@version 1.0
*/
import java.util.Random;

public class QuickSortRec {
	
	public static void quickSort(int[] array) {
		QuickSort(array, 0, array.length -1);
	}
	
	public static void quickSortDec(int[] array) {
		QuickSortDec(array, 0, array.length - 1);
	}
	
	public static void QuickSort(int[] array, int beg, int end)  {
		int n = partitionAsc(array, beg, end);
		// recursively call quicksort with the left side of partitioned array
		if ( beg < n-1 ) {
			QuickSort(array, beg, n-1);
		}
		// recursively call quicksort with the left side of partitioned array
		if (end > n) {
			QuickSort(array, n, end);
		} 
		
	}
	
	public static void QuickSortDec(int[] array, int beg, int end)  {
		int x = partitionDec(array, beg, end);
		// recursively call quicksort with the left side of partitioned array
		if ( beg < x-1 ) {
			QuickSortDec(array, beg, x-1);
		}
		// recursively call quicksort with the left side of partitioned array
		if (end > x) {
			QuickSortDec(array, x, end);
		} 
		
	}
	
	
	public static int partitionDec(int[] array, int left, int right) {
		int pivot = array[left];
		
		while (left <= right) {
			while (array[left] > pivot) {
				left++;
			}
			while (array[right] < pivot) {
				right--;
			}
			
			if (left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				
				left++; 
				right--;
			}
		}
		return left;
		
	}
	
	
	
	
	public static int partitionAsc(int[] array, int left, int right) {
		int pivot = array[left];
		
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				
				left++; 
				right--;
			}
		}
		return left;
	}
	
	public static void printArray(int[] array) {
		
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int size = 100;
		int max = 1000;
		int[] arr = new int[size];
		
		Random rand = new Random();
		rand.nextInt(max);
		
		for (int i = 0; i< arr.length; i++) {
			arr[i] = rand.nextInt(max);
		}
		
		
		 
		 System.out.println(" Before QuckSort: ");
		 printArray(arr);
		 System.out.println(" ");
		 
		  quickSort(arr);
		 
		
		System.out.println(" After Quicksort Ascending: ");
		printArray(arr);
		System.out.println(" ");
		
		quickSortDec(arr);
		System.out.println(" After Quicksort Descending: ");
		printArray(arr);
		System.out.println(" ");
		
		
		
		
		
	}
	
	
}