/** Implementing Selective Sort Iteratively
	@author Elshaday Assefa
	@version 1.0
	*/
import java.util.Random;

public class SelectiveSortIter {
	
	
	
	
	
	public static void Ascending( int[] array) {
		
		int minValue = 0;
		int minIndex = 0;
		int i;
		int j;
		
		
		for (i = 0; i< array.length; i++) {
			minValue = array[i];
			minIndex = i;
			for ( j=i + 1; j< array.length; j++) {
				if (array[j] < minValue) {
					minValue = array[j];
					minIndex = j;
				}
				
				
			}
			if(minIndex != i) {
				array[minIndex] = array[i];
				array[i] = minValue;
			}
		
		}
		
	}
	
	public static void Descending( int[] array) {
		int i;
		int j;
		int maxValue;
		int minIndex;
		
		for (i = 0; i< array.length; i++) {
			maxValue = array[i];
			minIndex = i;
			for(j = i + 1; j< array.length; j++) {
				if(  array[j] > maxValue){
					maxValue = array[j];
					minIndex = j;
					
				}
				if (minIndex != i){
					array[minIndex] = array[i];
					array[i] = maxValue;
					
				}
				
		}
		
		
	}
	
	}
		
	
	
	public static void main (String[] args) {
		int size = 100;
		int max = 5000;
		int[] arr = new int[size];
		
		Random rand = new Random();
		rand.nextInt(max);
		
		for (int i = 0; i< size; i++) {
			
			arr[i] = rand.nextInt(max);
		}
		System.out.println("Sorted random numbers from lowest to highest: ");
		Ascending(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("Sorted random numbers from highest to lowest: ");
		
		Descending(arr);
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	
	
	
	
	
	
	
