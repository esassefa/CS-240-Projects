//recursively sort an array using insertion sort 
import java.util.Random;

public class InsertionSortRec {
	
	
	public static int[] InsertionSortAsc(int[] array, int n) {
		if (n <= 1) {
			return array;
		}else {
		
		InsertionSortRecAsc(array, n-1);
		int temp = array[n];
		int j = n-1
		while ((j> -1) && (array[j] > temp)) {
		array[j+1] = array[j];
		j = j-1;
		}
		array[j+1] = temp;
		}
		
		
		
		return array
	}
	
	public static int[] InsertionSortDec(int[] array, int n){
		if (n <= 1) {
			return array;
		}else {
		
		InsertionSortDec(array, n-1);
		int temp = array[n];
		int j = n-1;
		while ((j> -1) && (array[j] < temp)) {
		array[j+1] = array[j];
		j = j-1;
		}
		array[j+1] = temp;
		}
		
	return array;	
	}
	
	public static void main(String[] args) {
		int size = 100;
		int max = 1000;
		int[] arr = new int[size];
		
		Random rand = new Random();
		rand.nextInt(max);
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = rand.nextInt(max);
		}
		int n = arr.length - 1;
		
		InsertionSortAsc(arr, n);
		System.out.println(" ");
		System.out.println("Insertion Sort recursively in Ascending order:");
		
		
		for( int i = 0; i< arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		InsertionSortDec(arr, n);
		System.out.println(" ");
		System.out.println("Insertion Sort recursively in Decending order:");
		
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
}