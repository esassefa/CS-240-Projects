/** Sorting array recursively using Quick sort; descending and ascending
	@author Elshaday Assefa
	@version 1.0
*/

import java.util.Random;


public class SelectiveSortRec {
	
	public static int[] selectiveSortAsc( int[] array, int n){
		if ( n == array.length -1) {
			return array;
			
		}
		int temp;
		int minIndex = n;
		 for (int i = n + 1; i< array.length; i++){
			  
			if (array[i] < array[minIndex]) {
				minIndex = i;
				
				
			}
			 
			 
		 }
		 temp = array[n];
		 array[n] = array[minIndex];
		 array[minIndex] = temp;
		 
		 return selectiveSortAsc( array,n+1);
		
		}
		
	public static int[] selectiveSortDec( int[] array,int n) {
		if (n == array.length -1) {
			return array;
		}
		int temp;
		int minIndex = n;
		for(int i = n + 1; i< array.length; i++) {
			
			if( array[i] > array[minIndex]) {
				minIndex = i;
				
				
			}
			
			
		}
		temp = array[n];
		array[n] = array[minIndex];
		array[minIndex] = temp;
		
		return selectiveSortDec(array, n+1);
		
	}
		
		

		
	
	
	
	
	public static void main(String[]args) {
		int size = 100;
		int max = 5000;
		int[] arr = new int[size];
		
		
		
		Random rand = new Random();
		rand.nextInt(max);
		
		for (int i = 0; i< size; i++) {
			
			arr[i] = rand.nextInt(max);
		}
		
		selectiveSortAsc(arr, 0);
		System.out.println("Ascending Recursive Selective Sort: ");
		for (int i = 0; i< arr.length; i++ ){
			System.out.print(arr[i] + " ");
		}
		
		selectiveSortDec(arr, 0);
		System.out.println(" ");
		System.out.println("Descending Recursive Selctive Sort: ");
		for (int i = 0; i< arr.length; i++) {
			System.out.print( arr[i] + " ");)
			
		}
		
	}
	
	
	
	
}

