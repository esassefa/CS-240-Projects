/** Sorting array recursively using Quick sort; descending and ascending
	@author Elshaday Assefa
	@version 1.0
*/
import java.util.Random;

public class InsertionSortIt {
	
	
	public static void InsertionSortAsc( int[] array) {
		int temp;
		for (int i = 1; i<array.length; i++ ) {
			temp = array[i];
			int j = i-1; 
			while ((j> -1) && (array[j] > temp)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
			
					
						}
			}
		
		
		
		

	
	
	public static void InsertionSortDec( int[] array) {
		
		int temp;
		for (int i = 1; i<array.length; i++ ) {
			temp = array[i];
			int j = i-1; 
			while ((j> -1) && (array[j] < temp)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
			
					
						}
		
		
	}
	
	
	
	public static void main(String[] args) {
		int size = 100;
		int max = 1000;
		int[] arr = new int[size];
		
		Random rand = new Random();
		
		rand.nextInt(max);
		
		for ( int i = 0; i< arr.length; i++) {
			arr[i] = rand.nextInt(max);
		}
		 
		 InsertionSortAsc(arr);
		 
		 System.out.print("Insertion Sort Ascending Order:");
		 System.out.println(" ");
		 
		 for (int i = 0; i<arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 System.out.println(" ");
		 
		 InsertionSortDec(arr);
		 System.out.println(" Insertion Sort Decending order: ");
		 
		 for (int i = 0; i < arr.length; i ++) {
			 System.out.println(arr[i] + " " );
			 
		 }
		 
		
		
		
	}
	
}