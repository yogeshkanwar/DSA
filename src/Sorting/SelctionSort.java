package Sorting;

			
//			Selection Sort Algorithm:
//			Overview: Selection Sort divides the input array into two parts: sorted and unsorted. Initially, the sorted part is empty, and the unsorted part contains the entire array.
//			
//			Sorting Process:
//			
//			Step 1: Find the smallest element in the unsorted portion of the array.
//			Step 2: Swap this smallest element with the first element of the unsorted portion.
//			Step 3: Expand the sorted portion by one element (move the boundary between sorted and unsorted).
//			Repeat the above steps until the entire array is sorted.

public class SelctionSort {

	 public static void main(String args[])
	 {
	     int a[] = { 64, 34, 25, 12, 22, 11, 90 };
	     int n = a.length;
	     
	     for(int i=0; i<n; i++) {
	    	 int minIndex = i;
	    	 for(int j=i+1; j<n; j++) {
	    		 if(a[j] < a[minIndex]) {
	    			 minIndex = j;
	    	      }
	    	 }
	    	 if(i != minIndex) {
	    		 int temp = a[i];
	    		 a[i] = a[minIndex];
	    		 a[minIndex] = temp;
	    	 }
	    	  
	     }
	     for(int k=0;k<n;k++) {
	    	 System.out.print(a[k] + " ");
	     }
	     
	 }
}
