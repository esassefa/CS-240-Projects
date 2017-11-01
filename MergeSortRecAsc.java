/** implementing Merge Sort Algorithm recursively
	@author Elshaday Assefa
*/
import java.util.Random;


public class MergeSortRecAsc {
	
	public static int[] MergeSort(int[] array) {
		if (array.length<= 1) {
			return array;
			
		}
		int mid = (array.length)/2;
		int[] L = new int[mid];
		int[] R = new int[array.length - mid];
		
		for (int i = 0; i< mid; i++) {
			L[i] = array[i];
		}
		for (int j = 0; j< R.length; j++) {
			R[j] = array[mid + j];
			
		}
		
		int[] Ascending = new int[array.length];
		int[] Decending = new int[array.length]; 
		L = MergeSort(L);
		R = MergeSort(R);
		
		Ascending = CombineMergeAsc(L, R); 
		
		return Ascending;
		
		
	}
	
	public static int[] CombineMergeAsc(int[] left, int[] right) {
		
		int fullLength = left.length + right.length;
		int[] full = new int[fullLength];
		int indexL = 0;
		int indexR = 0;
		int indexFull = 0;
		
		while (indexL < left.length || indexR < right.length) {
			if (indexL < left.length && indexR < right.length) {
				if (left[indexL] <= right[indexR]) {
					full[indexFull] = left[indexL];
					indexL++; 
					indexFull++;
				}
				else {
					
					full [indexFull] = right[indexR];
					indexR++;
					indexFull++;
				}
				
			}
			else if (indexL < left.length) {
				full [indexFull] =left[indexL];
				indexL++;
				indexFull++;
			}
			else if (indexR < right.length) {
				full [indexFull] = right[indexR];
				indexR++;
				indexFull++;
			}
		}
		return full;
	}
	
	
	
	public static void printArray (int [] array) {
		for (int i = 0; i< array.length; i++) {
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
		System.out.println("Before Sorting: ");
		printArray(arr);
		
		arr = MergeSort(arr);
		
		System.out.println(" ");
		System.out.println("After Sorting: ");
		printArray(arr);
	
		
	}
	
	
	
	
	
}